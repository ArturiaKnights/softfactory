package com.mobile.pojo;

import java.util.Date;

public class Business {
    private Integer id;

    private String sellerPhone;

    private String cusPhone;

    private String proName;

    private String busType;

    private Date busOpen;

    private Date busClose;

    private Integer sellerId;

    private String busStatus;

    public Business(Integer id, String sellerPhone, String cusPhone, String proName, String busType, Date busOpen, Date busClose, Integer sellerId, String busStatus) {
        this.id = id;
        this.sellerPhone = sellerPhone;
        this.cusPhone = cusPhone;
        this.proName = proName;
        this.busType = busType;
        this.busOpen = busOpen;
        this.busClose = busClose;
        this.sellerId = sellerId;
        this.busStatus = busStatus;
    }

    public Business() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellerPhone() {
        return sellerPhone;
    }

    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone == null ? null : cusPhone.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType == null ? null : busType.trim();
    }

    public Date getBusOpen() {
        return busOpen;
    }

    public void setBusOpen(Date busOpen) {
        this.busOpen = busOpen;
    }

    public Date getBusClose() {
        return busClose;
    }

    public void setBusClose(Date busClose) {
        this.busClose = busClose;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getBusStatus() {
        return busStatus;
    }

    public void setBusStatus(String busStatus) {
        this.busStatus = busStatus == null ? null : busStatus.trim();
    }
}