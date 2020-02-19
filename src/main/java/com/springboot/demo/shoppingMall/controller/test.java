package com.springboot.demo.shoppingMall.controller;

import com.springboot.demo.shoppingMall.model.Test;
import com.springboot.demo.shoppingMall.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: wangyinan
 * @Description:
 * @Date: Create in 2:35 2020/2/19
 */
@RestController
public class test {

    @Autowired
    private testService test;

    @RequestMapping("/aaa")
    public List<Test> name(){
        List<Test> list= test.select();
        return list;
    }

    @RequestMapping("/helloword")
    private String HelloWord(){
        return "Hello Word - Spring Boot";
    }
}
