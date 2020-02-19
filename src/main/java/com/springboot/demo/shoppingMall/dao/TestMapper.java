package com.springboot.demo.shoppingMall.dao;

import com.springboot.demo.shoppingMall.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wangyinan
 * @Description:
 * @Date: Create in 3:00 2020/2/19
 */
@Repository
public interface TestMapper {
    public List<Test> select();
}
