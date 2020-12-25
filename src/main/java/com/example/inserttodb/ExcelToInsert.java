package com.example.inserttodb;


import com.example.service.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.io.*;
import java.util.Date;


@Component
public class ExcelToInsert {

    @Autowired
    private Test test;

    @PostConstruct
    @Scheduled(cron = "0 0 0 1/1 * ? ")
    public void test() throws IOException{
        String filePath = "C:\\Users\\LENOVO\\Desktop\\活动量历史数据.xlsx";
        InputStream fis = null;

        fis = new FileInputStream(filePath);
        Workbook workbook = null;
        if (filePath.endsWith(".xlsx")) {
            workbook = new XSSFWorkbook(fis);
        } else if (filePath.endsWith(".xls") || filePath.endsWith(".et")) {
            workbook = new HSSFWorkbook(fis);
        }
        fis.close();

        /* 读EXCEL文字内容 */
        // 获取第一个sheet表，也可使用sheet表名获取
        Sheet sheet = workbook.getSheetAt(0);

        //获得数据的总行数
        int totalRowNum = sheet.getLastRowNum();

        //获得所有数据
        for(int i = 1 ; i <= totalRowNum ; i++)
        {
                //获得第i行对象
                Row row = sheet.getRow(i);

                //agentCode
                Cell cell = row.getCell(0);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                String agentCode = cell.getStringCellValue();

                //ownerType
                String ownerType = "";
                //判断是否为内外勤,caAgent 外勤
                if (row.getCell(1).getStringCellValue().equals("caAgent")) {
                    //外勤
                    ownerType = "2";
                } else {
                    //内勤
                    ownerType = "1";
                }

                //客户姓名
                Cell cell2 =row.getCell(2);
                cell2.setCellType(Cell.CELL_TYPE_STRING);
                String customName = cell2.getStringCellValue();

                //客户手机号
                String customPhone="";
                try {
                    Cell cell3 = row.getCell(3);
                    cell3.setCellType(Cell.CELL_TYPE_STRING);
                    customPhone=cell3.getStringCellValue();
                }catch (Exception e){
                    System.out.println("第"+i+"行手机号缺失");
                }


                //标签lable
                String label = "";
                Cell cell4 = row.getCell(4);
                cell4.setCellType(Cell.CELL_TYPE_STRING);
                if (cell4.getStringCellValue().equals("4")) {
                    label = "1";
                } else if (cell4.getStringCellValue().equals("6")) {
                    label = "3";
                } else if ((cell4.getStringCellValue().equals("5"))) {
                    label = "7";
                }

                //拜访备注
                String content ="";
                try {
                    Cell cell5 = row.getCell(5);
                    cell5.setCellType(Cell.CELL_TYPE_STRING);
                    content = cell5.getStringCellValue();
                }catch (Exception e){
                    System.out.println("第"+i+"行备注缺失");
                }
                //拜访开始日期 时分秒
                Date startTime = row.getCell(6).getDateCellValue();
                try{
                    test.insertdb(i, agentCode, ownerType, customName, customPhone, label, content, startTime);
                } catch (Exception e) {
                    System.out.println("第"+i+"行插入出现异常");
                    e.printStackTrace();
                    try{
                        File file =new File("C:\\Users\\LENOVO\\Desktop\\error.txt");

                        //if file doesnt exists, then create it
                        if(!file.exists()){
                            file.createNewFile();
                        }

                        //true = append file
                        FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("第"+i+"行插入出现异常\n"+e.toString()+"\n");
                        bw.close();

                        System.out.println("Done");

                    }catch(IOException e1){
                        e1.printStackTrace();
                    }

                }

        }

        System.out.println("所有数据都已经插入数据库");
    }


}

