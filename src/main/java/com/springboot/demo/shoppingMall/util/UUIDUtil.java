package com.springboot.demo.shoppingMall.util;

import java.util.UUID;

/**
 * @author: 帅气的达
 * UUID工具类
 * Created by gameloft9 on 2017/12/5.
 */
public class UUIDUtil {

    /**
     * 产生紧凑型32位UUID
     * @return
     */
    public static String getUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }
}
