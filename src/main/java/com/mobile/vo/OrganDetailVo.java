package com.mobile.vo;

import java.io.Serializable;

public class OrganDetailVo implements Serializable{

    private Integer organId;

    private String organHeigh;

    private String organName;

    private String organType;

    private String organLoc;

    private String organDir;

    private String organLinkman;

    private String organPhone;

    private String organExplain;

    //上级组织名称
    private String highLevelOrgan;


    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public String getOrganHeigh() {
        return organHeigh;
    }

    public void setOrganHeigh(String organHeigh) {
        this.organHeigh = organHeigh;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType;
    }

    public String getOrganLoc() {
        return organLoc;
    }

    public void setOrganLoc(String organLoc) {
        this.organLoc = organLoc;
    }

    public String getOrganDir() {
        return organDir;
    }

    public void setOrganDir(String organDir) {
        this.organDir = organDir;
    }

    public String getOrganLinkman() {
        return organLinkman;
    }

    public void setOrganLinkman(String organLinkman) {
        this.organLinkman = organLinkman;
    }

    public String getOrganPhone() {
        return organPhone;
    }

    public void setOrganPhone(String organPhone) {
        this.organPhone = organPhone;
    }

    public String getOrganExplain() {
        return organExplain;
    }

    public void setOrganExplain(String organExplain) {
        this.organExplain = organExplain;
    }


    public String getHighLevelOrgan() {
        return highLevelOrgan;
    }

    public void setHighLevelOrgan(String highLevelOrgan) {
        this.highLevelOrgan = highLevelOrgan;
    }
}
