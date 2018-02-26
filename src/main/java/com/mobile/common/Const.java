package com.mobile.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 常量类
 */
public class Const {

    public static final String CURRENT_USER = "current_user";

    public static final String USERNAME = "username";

    public enum Role{
        SYS_MANAGER(1,"系统管理员"),
        SYS_USER(2,"普通用户");

        private int code;
        private String desc;//说明

        Role(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }





}
