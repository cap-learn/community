package com.nowcoder.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    /**
     * id 主键
     */
    private int id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 用户类型
     * 0-普通用户; 1-超级管理员; 2-版主;
     */
    private int type;

    /**
     * 用户激活状态
     * 0-未激活; 1-已激活;
     */
    private int status;

    /**
     * 激活码
     */
    private String activationCode;

    /**
     * 头像地址
     */
    private String headerUrl;

    /**
     * 用户注册时间
     */
    private Date createTime;
}
