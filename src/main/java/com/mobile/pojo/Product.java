package com.mobile.pojo;

import java.util.Date;

public class Product {
    private Integer proId;

    private String proName;

    private String proType;

    private String proCost;

    private String proLoc;

    private String proImg;

    private Double proFirst;

    private Double proMonth;

    private String proLink;

    private String proOut;

    private String proStatus;

    private Date proDate;

    public Product(Integer proId, String proName, String proType, String proCost, String proLoc, String proImg, Double proFirst, Double proMonth, String proLink, String proOut, String proStatus, Date proDate) {
        this.proId = proId;
        this.proName = proName;
        this.proType = proType;
        this.proCost = proCost;
        this.proLoc = proLoc;
        this.proImg = proImg;
        this.proFirst = proFirst;
        this.proMonth = proMonth;
        this.proLink = proLink;
        this.proOut = proOut;
        this.proStatus = proStatus;
        this.proDate = proDate;
    }

    public Product() {
        super();
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType == null ? null : proType.trim();
    }

    public String getProCost() {
        return proCost;
    }

    public void setProCost(String proCost) {
        this.proCost = proCost == null ? null : proCost.trim();
    }

    public String getProLoc() {
        return proLoc;
    }

    public void setProLoc(String proLoc) {
        this.proLoc = proLoc == null ? null : proLoc.trim();
    }

    public String getProImg() {
        return proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg == null ? null : proImg.trim();
    }

    public Double getProFirst() {
        return proFirst;
    }

    public void setProFirst(Double proFirst) {
        this.proFirst = proFirst;
    }

    public Double getProMonth() {
        return proMonth;
    }

    public void setProMonth(Double proMonth) {
        this.proMonth = proMonth;
    }

    public String getProLink() {
        return proLink;
    }

    public void setProLink(String proLink) {
        this.proLink = proLink == null ? null : proLink.trim();
    }

    public String getProOut() {
        return proOut;
    }

    public void setProOut(String proOut) {
        this.proOut = proOut == null ? null : proOut.trim();
    }

    public String getProStatus() {
        return proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus == null ? null : proStatus.trim();
    }

    public Date getProDate() {
        return proDate;
    }

    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }
}