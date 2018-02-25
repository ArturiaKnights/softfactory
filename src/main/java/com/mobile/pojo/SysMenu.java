package com.mobile.pojo;

public class SysMenu {
    private Integer menuId;

    private Integer menuParentId;

    private Integer seq;

    private String menuName;

    private String menuDescn;

    private String menuLinkUrl;

    private String menuStatus;

    public SysMenu(Integer menuId, Integer menuParentId, Integer seq, String menuName, String menuDescn, String menuLinkUrl, String menuStatus) {
        this.menuId = menuId;
        this.menuParentId = menuParentId;
        this.seq = seq;
        this.menuName = menuName;
        this.menuDescn = menuDescn;
        this.menuLinkUrl = menuLinkUrl;
        this.menuStatus = menuStatus;
    }

    public SysMenu() {
        super();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuDescn() {
        return menuDescn;
    }

    public void setMenuDescn(String menuDescn) {
        this.menuDescn = menuDescn == null ? null : menuDescn.trim();
    }

    public String getMenuLinkUrl() {
        return menuLinkUrl;
    }

    public void setMenuLinkUrl(String menuLinkUrl) {
        this.menuLinkUrl = menuLinkUrl == null ? null : menuLinkUrl.trim();
    }

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus == null ? null : menuStatus.trim();
    }
}