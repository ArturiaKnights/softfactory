package com.mobile.pojo;

public class Organ {
    private Integer organId;

    private String organHeigh;

    private String organName;

    private String organType;

    private String organLoc;

    private String organDir;

    private String organLinkman;

    private String organPhone;

    private String organExplain;

    public Organ(Integer organId, String organHeigh, String organName, String organType, String organLoc, String organDir, String organLinkman, String organPhone, String organExplain) {
        this.organId = organId;
        this.organHeigh = organHeigh;
        this.organName = organName;
        this.organType = organType;
        this.organLoc = organLoc;
        this.organDir = organDir;
        this.organLinkman = organLinkman;
        this.organPhone = organPhone;
        this.organExplain = organExplain;
    }

    public Organ() {
        super();
    }

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
        this.organHeigh = organHeigh == null ? null : organHeigh.trim();
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    public String getOrganType() {
        return organType;
    }

    public void setOrganType(String organType) {
        this.organType = organType == null ? null : organType.trim();
    }

    public String getOrganLoc() {
        return organLoc;
    }

    public void setOrganLoc(String organLoc) {
        this.organLoc = organLoc == null ? null : organLoc.trim();
    }

    public String getOrganDir() {
        return organDir;
    }

    public void setOrganDir(String organDir) {
        this.organDir = organDir == null ? null : organDir.trim();
    }

    public String getOrganLinkman() {
        return organLinkman;
    }

    public void setOrganLinkman(String organLinkman) {
        this.organLinkman = organLinkman == null ? null : organLinkman.trim();
    }

    public String getOrganPhone() {
        return organPhone;
    }

    public void setOrganPhone(String organPhone) {
        this.organPhone = organPhone == null ? null : organPhone.trim();
    }

    public String getOrganExplain() {
        return organExplain;
    }

    public void setOrganExplain(String organExplain) {
        this.organExplain = organExplain == null ? null : organExplain.trim();
    }
}