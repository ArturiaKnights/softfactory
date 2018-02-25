package com.mobile.pojo;

import java.util.Date;

public class Joiner {
    private Integer joinerId;

    private String joinerName;

    private Integer organId;

    private String joinerLoc;

    private String joinerLinkname;

    private String joinerPhone;

    private String joinerEmail;

    private String joinerAddress;

    private String joinerBank;

    private String joinerHolder;

    private String joinerBanknum;

    private String joinerExplain;

    private Integer joLevelId;

    private Integer joHeigherId;

    private Date joinerDate;

    private Integer userId;

    private String joinerStatus;

    private String joinerRemark;

    public Joiner(Integer joinerId, String joinerName, Integer organId, String joinerLoc, String joinerLinkname, String joinerPhone, String joinerEmail, String joinerAddress, String joinerBank, String joinerHolder, String joinerBanknum, String joinerExplain, Integer joLevelId, Integer joHeigherId, Date joinerDate, Integer userId, String joinerStatus, String joinerRemark) {
        this.joinerId = joinerId;
        this.joinerName = joinerName;
        this.organId = organId;
        this.joinerLoc = joinerLoc;
        this.joinerLinkname = joinerLinkname;
        this.joinerPhone = joinerPhone;
        this.joinerEmail = joinerEmail;
        this.joinerAddress = joinerAddress;
        this.joinerBank = joinerBank;
        this.joinerHolder = joinerHolder;
        this.joinerBanknum = joinerBanknum;
        this.joinerExplain = joinerExplain;
        this.joLevelId = joLevelId;
        this.joHeigherId = joHeigherId;
        this.joinerDate = joinerDate;
        this.userId = userId;
        this.joinerStatus = joinerStatus;
        this.joinerRemark = joinerRemark;
    }

    public Joiner() {
        super();
    }

    public Integer getJoinerId() {
        return joinerId;
    }

    public void setJoinerId(Integer joinerId) {
        this.joinerId = joinerId;
    }

    public String getJoinerName() {
        return joinerName;
    }

    public void setJoinerName(String joinerName) {
        this.joinerName = joinerName == null ? null : joinerName.trim();
    }

    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public String getJoinerLoc() {
        return joinerLoc;
    }

    public void setJoinerLoc(String joinerLoc) {
        this.joinerLoc = joinerLoc == null ? null : joinerLoc.trim();
    }

    public String getJoinerLinkname() {
        return joinerLinkname;
    }

    public void setJoinerLinkname(String joinerLinkname) {
        this.joinerLinkname = joinerLinkname == null ? null : joinerLinkname.trim();
    }

    public String getJoinerPhone() {
        return joinerPhone;
    }

    public void setJoinerPhone(String joinerPhone) {
        this.joinerPhone = joinerPhone == null ? null : joinerPhone.trim();
    }

    public String getJoinerEmail() {
        return joinerEmail;
    }

    public void setJoinerEmail(String joinerEmail) {
        this.joinerEmail = joinerEmail == null ? null : joinerEmail.trim();
    }

    public String getJoinerAddress() {
        return joinerAddress;
    }

    public void setJoinerAddress(String joinerAddress) {
        this.joinerAddress = joinerAddress == null ? null : joinerAddress.trim();
    }

    public String getJoinerBank() {
        return joinerBank;
    }

    public void setJoinerBank(String joinerBank) {
        this.joinerBank = joinerBank == null ? null : joinerBank.trim();
    }

    public String getJoinerHolder() {
        return joinerHolder;
    }

    public void setJoinerHolder(String joinerHolder) {
        this.joinerHolder = joinerHolder == null ? null : joinerHolder.trim();
    }

    public String getJoinerBanknum() {
        return joinerBanknum;
    }

    public void setJoinerBanknum(String joinerBanknum) {
        this.joinerBanknum = joinerBanknum == null ? null : joinerBanknum.trim();
    }

    public String getJoinerExplain() {
        return joinerExplain;
    }

    public void setJoinerExplain(String joinerExplain) {
        this.joinerExplain = joinerExplain == null ? null : joinerExplain.trim();
    }

    public Integer getJoLevelId() {
        return joLevelId;
    }

    public void setJoLevelId(Integer joLevelId) {
        this.joLevelId = joLevelId;
    }

    public Integer getJoHeigherId() {
        return joHeigherId;
    }

    public void setJoHeigherId(Integer joHeigherId) {
        this.joHeigherId = joHeigherId;
    }

    public Date getJoinerDate() {
        return joinerDate;
    }

    public void setJoinerDate(Date joinerDate) {
        this.joinerDate = joinerDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getJoinerStatus() {
        return joinerStatus;
    }

    public void setJoinerStatus(String joinerStatus) {
        this.joinerStatus = joinerStatus == null ? null : joinerStatus.trim();
    }

    public String getJoinerRemark() {
        return joinerRemark;
    }

    public void setJoinerRemark(String joinerRemark) {
        this.joinerRemark = joinerRemark == null ? null : joinerRemark.trim();
    }
}