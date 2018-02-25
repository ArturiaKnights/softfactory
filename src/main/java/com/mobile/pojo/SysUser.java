package com.mobile.pojo;

public class SysUser {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userFlag;

    public SysUser(Integer userId, String userName, String userPassword, String userFlag) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userFlag = userFlag;
    }

    public SysUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserFlag() {
        return userFlag;
    }

    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag == null ? null : userFlag.trim();
    }
}