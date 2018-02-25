package com.mobile.pojo;

public class SysMenuRole {
    private Integer menuId;

    private Integer roleId;

    public SysMenuRole(Integer menuId, Integer roleId) {
        this.menuId = menuId;
        this.roleId = roleId;
    }

    public SysMenuRole() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}