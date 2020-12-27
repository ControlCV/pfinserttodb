package com.example.utils;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GenroterExcel {
    public static void main(String[] args) throws IOException {
        // 创建工作薄
        XSSFWorkbook workBook = new XSSFWorkbook();
        // 在工作薄中创建一工作表
        XSSFSheet sheet = workBook.createSheet();
//        // 在指定的索引处创建一行
//        XSSFRow row = sheet.createRow(0);

//        // 在指定的索引处创建一列（单元格）
//        XSSFCell userCode = row.createCell(0);
//        // 定义单元格为字符串类型
//        userCode.setCellType(XSSFCell.CELL_TYPE_STRING);
//        // 在单元格输入内容
//        XSSFRichTextString userCodeContent = new XSSFRichTextString("userCode");
//        userCode.setCellValue(userCodeContent);
//
//
//        XSSFCell city = row.createCell(1);
//        city.setCellType(XSSFCell.CELL_TYPE_STRING);
//        XSSFRichTextString cityContent = new XSSFRichTextString("authType");
//        city.setCellValue(cityContent);

        for (int i = 0; i <100000 ; i++) {
            XSSFRow row = sheet.createRow(i);

            // 在指定的索引处创建一列（单元格）
            XSSFCell userCode = row.createCell(0);
            // 定义单元格为字符串类型
            userCode.setCellType(XSSFCell.CELL_TYPE_STRING);
            // 在单元格输入内容
            XSSFRichTextString userCodeContent = new XSSFRichTextString("SH11006248");
            userCode.setCellValue(userCodeContent);

            // 在指定的索引处创建一列（单元格）
            XSSFCell authType = row.createCell(1);
            // 定义单元格为字符串类型
            authType.setCellType(XSSFCell.CELL_TYPE_STRING);
            // 在单元格输入内容
            XSSFRichTextString authTypeContent = new XSSFRichTextString("caAgent");
            authType.setCellValue(authTypeContent);

            // 在指定的索引处创建一列（单元格）
            XSSFCell client_name = row.createCell(2);
            // 定义单元格为字符串类型
            client_name.setCellType(XSSFCell.CELL_TYPE_STRING);
            // 在单元格输入内容
            XSSFRichTextString client_nameContent = new XSSFRichTextString("国籍");
            client_name.setCellValue(client_nameContent);

            // 在指定的索引处创建一列（单元格）
            XSSFCell client_moblie = row.createCell(3);
            // 定义单元格为字符串类型
            client_moblie.setCellType(XSSFCell.CELL_TYPE_STRING);
            // 在单元格输入内容
            XSSFRichTextString client_moblieContent = new XSSFRichTextString("17755452340");
            client_moblie.setCellValue(client_moblieContent);

            // 在指定的索引处创建一列（单元格）
            XSSFCell calendar_type= row.createCell(4);
            // 定义单元格为字符串类型
            calendar_type.setCellType(XSSFCell.CELL_TYPE_STRING);
            // 在单元格输入内容
            XSSFRichTextString calendar_typeContent = new XSSFRichTextString("4");
            calendar_type.setCellValue(calendar_typeContent);


            // 在指定的索引处创建一列（单元格）
            XSSFCell  calendar_content= row.createCell(5);
            // 定义单元格为字符串类型
            calendar_content.setCellType(XSSFCell.CELL_TYPE_STRING);
            // 在单元格输入内容
            XSSFRichTextString  calendar_contentContent = new XSSFRichTextString("遗憾的就是大家是否涉及的国防军广泛护卫如额火箭发射的换句话说就是发回家撒谎很多撒谎就还记得撒谎觉得火炬大厦酒店会觉得还是觉得是回家的时候大家好的绝杀的机会还得几十块的就是和解释的机会活动设计环节都是和倒计时倒计时的很久很久收到回复回家的时候技术大会回家的时代精神和倒计时倒计时还记得还是觉得和");
            calendar_content.setCellValue( calendar_contentContent);

            // 在指定的索引处创建一列（单元格）
            XSSFCell  act_date= row.createCell(6);
            // 定义单元格为字符串类型
            act_date.setCellType(XSSFCell.CELL_TYPE_STRING);
            // 在单元格输入内容
            XSSFRichTextString  act_dateContent = new XSSFRichTextString("2020/12/7  0:00:00");
            act_date.setCellValue(act_dateContent);
        }



        // 新建一输出流并把相应的excel文件存盘
        FileOutputStream fos = new FileOutputStream("C:\\Users\\19161\\Desktop\\1111.xlsx");
        workBook.write(fos);
        fos.flush();
        //操作结束，关闭流
        fos.close();
        System.out.println("文件生成");
    }
}
