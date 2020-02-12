package com.springboot.demo.shoppingMall.util.system;

import com.ssm.demo.model.SysRolePermissions;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: 帅气的达
 * 登录成功返回bean
 * Created by gameloft9 on 2017/12/11.
 */
@Data
public class LoginResponse implements Serializable{

    /**
     * 用户id
     * */
    private String userId;
    /**
     * 登录名
     * */
    private String loginName;

    /**
     * web上下文
     * */
    private String webContext;
    /**
     * 权限
     */
    private List<SysRolePermissions> permissionList;
}
