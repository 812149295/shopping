package com.springboot.demo.shoppingMall.service;

import com.springboot.demo.shoppingMall.dao.TestMapper;
import com.springboot.demo.shoppingMall.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangyinan
 * @Description:
 * @Date: Create in 3:22 2020/2/19
 */
@Service
public interface testService {

    public List<Test> select();
}
