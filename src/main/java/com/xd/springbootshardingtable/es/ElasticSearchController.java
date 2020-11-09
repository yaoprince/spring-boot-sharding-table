package com.xd.springbootshardingtable.es;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ElasticSearchController {

    @Autowired
    BusReceiverService busReceiverService;

    @RequestMapping("/save")
    public String save(){
        BusReceiverEntity busReceiverEntity = new BusReceiverEntity();
        busReceiverEntity.setId(1L);
        busReceiverEntity.setAddress("上海市虹口路");
        busReceiverEntity.setCreateDate(new Date());
        busReceiverEntity.setEnName("幺幺");
        busReceiverEntity.setRegionCode("10000");
//        busReceiverEntity.setMemberFamily(2);
        busReceiverService.save(busReceiverEntity);
        return "save";
    }
}