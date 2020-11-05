package com.xd.springbootshardingtable.controller;

import com.xd.springbootshardingtable.entity.User;
import com.xd.springbootshardingtable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Classname UserController
 * @Description 用户测试控制类
 * @Author 李号东 lihaodongmail@163.com
 * @Date 2019-05-26 17:36
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }

    private static AtomicInteger atomicInteger = new AtomicInteger(400000);

    @GetMapping("/insert")
    public Boolean insert() {
        for(int i=0;i<10000;i++){
            User user = new User();
            user.setId(atomicInteger.incrementAndGet());
            user.setName(UUID.randomUUID().toString().substring(1));
            user.setAge((int)(Math.random()*1000));
            userService.save(user);
        }
        return true;
    }

    @GetMapping("/selectcount")
    public Integer selectcount() {
        return userService.getcount();
    }

    @GetMapping("/getUserListByAge")
    public List<User> getUserListByAge(Integer age) {
        return userService.getUserListByAge(age);
    }

    @GetMapping("/insertone")
    public Boolean insertone(User user) {

        return  userService.save(user);
    }

}
