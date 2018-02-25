package com.mobile.pojo;

import java.util.Date;

public class Seller {
    private Integer sellerId;

    private String sellerPhone;

    private String sellerName;

    private Integer joinerId;

    private Integer userId;

    private String sellerSex;

    private String sellerCard;

    private String sellerCardnum;

    private String sellerRemark;

    private Date sellerDate;

    private String sellerLoc;

    public Seller(Integer sellerId, String sellerPhone, String sellerName, Integer joinerId, Integer userId, String sellerSex, String sellerCard, String sellerCardnum, String sellerRemark, Date sellerDate, String sellerLoc) {
        this.sellerId = sellerId;
        this.sellerPhone = sellerPhone;
        this.sellerName = sellerName;
        this.joinerId = joinerId;
        this.userId = userId;
        this.sellerSex = sellerSex;
        this.sellerCard = sellerCard;
        this.sellerCardnum = sellerCardnum;
        this.sellerRemark = sellerRemark;
        this.sellerDate = sellerDate;
        this.sellerLoc = sellerLoc;
    }

    public Seller() {
        super();
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public Integer getJoinerId() {
        return joinerId;
    }

    public void setJoinerId(Integer joinerId) {
        this.joinerId = joinerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSellerSex() {
        return sellerSex;
    }

    public void setSellerSex(String sellerSex) {
        this.sellerSex = sellerSex == null ? null : sellerSex.trim();
    }

    public String getSellerCard() {
        return sellerCard;
    }

    public void setSellerCard(String sellerCard) {
        this.sellerCard = sellerCard == null ? null : sellerCard.trim();
    }

    public String getSellerCardnum() {
        return sellerCardnum;
    }

    public void setSellerCardnum(String sellerCardnum) {
        this.sellerCardnum = sellerCardnum == null ? null : sellerCardnum.trim();
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark == null ? null : sellerRemark.trim();
    }

    public Date getSellerDate() {
        return sellerDate;
    }

    public void setSellerDate(Date sellerDate) {
        this.sellerDate = sellerDate;
    }

    public String getSellerLoc() {
        return sellerLoc;
    }

    public void setSellerLoc(String sellerLoc) {
        this.sellerLoc = sellerLoc == null ? null : sellerLoc.trim();
    }
}