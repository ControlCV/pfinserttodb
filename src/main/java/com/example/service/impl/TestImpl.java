package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.entity.TContact;
import com.example.entity.TEvent;
import com.example.entity.TEventContactShip;
import com.example.entity.TLabelRelationShip;
import com.example.inserttodb.id.IdGenerator;
import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TestImpl implements Test {

    @Autowired
    private TEventService tEventService;

    @Autowired
    private TContactService tContactService;

    @Autowired
    private TEventContactShipService tEventContactShipService;

    @Autowired
    private TLabelRelationShipService tLabelRelationShipService;

    @Autowired
    private IdGenerator idGenerator;

    @Override
    public void insertdb(int i, String agentCode, String ownerType, String customName, String customPhone, String label, String content, Date startTime)  {
            //1.插入事件表
            TEvent tEvent = new TEvent();
            //雪花算法生成主键
            String eventId = idGenerator.generateStr();
            tEvent.setId(eventId);
            tEvent.setOwnerId(agentCode);
            tEvent.setOwnerType(ownerType);

            DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            tEvent.setStartDateTime(startTime);

            DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String format2 = format1.format(startTime);
            try{
                tEvent.setStartDate(format1.parse(format2 ));
            }catch (Exception e){

            }


            tEvent.setHighestSortLabelId(label);
            tEvent.setSource("1");//默认来自建议书
            tEvent.setStatus("1");//默认已完成
            tEvent.setIsDelete(0);//默认未删除
            tEvent.setCreatedDateTime(new Date());
            tEvent.setCreatedById(agentCode);
            tEvent.setRemark(content);
            tEventService.save(tEvent);

            //2.插入联系人表
            //去数据库查询agentCode下所有的客户
            QueryWrapper<TContact> tContactQueryWrapper = new QueryWrapper<>();
            tContactQueryWrapper.eq("owner_id",agentCode);
            List<TContact> contacts = tContactService.list(tContactQueryWrapper);

            //agentCode下所有的客户名单是否包含excel中的客户姓名和手机号
            String contactId="";
            boolean flag=false;
            for (TContact contact: contacts ) {
                if(contact.getName().equals(customName)&&contact.getMobile().equals(customPhone)){
                    flag=true;
                    contactId=contact.getId();
                    break;
                }
            }

            if(!flag){
                //不包含联系人，contact表中新增一条数据

                //雪花算法生成主键
                contactId=idGenerator.generateStr();
                TContact tContact = new TContact();
                tContact.setId(contactId);
                tContact.setOwnerId(agentCode);
                tContact.setOwnerType(ownerType);
                tContact.setType("0");//默认是客户
                tContact.setName(customName);
                tContact.setMobile(customPhone);
                tContact.setIsDelete(0);
                tContact.setCreatedDateTime(new Date());
                tContact.setCreatedById(agentCode);

                tContactService.save(tContact);

            }

            //将事件表的id和contact表的id插入到事件联系人关系表
            TEventContactShip tEventContactShip = new TEventContactShip();
            //雪花算法生成主键
            tEventContactShip.setId(idGenerator.generateStr());
            tEventContactShip.setEventId(eventId);
            tEventContactShip.setContactId(contactId);
            tEventContactShip.setIsDelete(0);
            tEventContactShip.setCreatedDateTime(new Date());
            tEventContactShip.setCreatedById(agentCode);

            tEventContactShipService.save(tEventContactShip);

            //插入事件标签表
            TLabelRelationShip tLabelRelationShip = new TLabelRelationShip();

            tLabelRelationShip.setId(idGenerator.generateStr());
            tLabelRelationShip.setRelationId(eventId);
            tLabelRelationShip.setLabelId(label);
            tLabelRelationShip.setIsDelete(0);
            tLabelRelationShip.setCreatedDateTime(new Date());
            tLabelRelationShip.setCreatedById(agentCode);

            tLabelRelationShipService.save(tLabelRelationShip);

            System.out.println("第"+i+"行1111111111111111111111111111111111111111111");

    }

}
