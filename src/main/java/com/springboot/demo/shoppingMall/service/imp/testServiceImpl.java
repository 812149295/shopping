package com.springboot.demo.shoppingMall.service.imp;

import com.springboot.demo.shoppingMall.dao.TestMapper;
import com.springboot.demo.shoppingMall.model.Test;
import com.springboot.demo.shoppingMall.service.testService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangyinan
 * @Description:
 * @Date: Create in 3:22 2020/2/19
 */
@Slf4j
@Service
public class testServiceImpl implements testService {
    @Autowired
    TestMapper testMapper;
    @Override
    public List<Test> select() {
        List<Test> list = testMapper.select();
        return list;
    }
}
