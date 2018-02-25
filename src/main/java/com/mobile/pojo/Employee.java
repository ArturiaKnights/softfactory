package com.mobile.pojo;

public class Employee {
    private Integer id;

    private Integer organId;

    private String job;

    private String name;

    private String sex;

    private String phone;

    private String docType;

    private String docNumber;

    private String agentName;

    private String loc;

    private String bankName;

    private String bankNumber;

    private Integer userId;

    public Employee(Integer id, Integer organId, String job, String name, String sex, String phone, String docType, String docNumber, String agentName, String loc, String bankName, String bankNumber, Integer userId) {
        this.id = id;
        this.organId = organId;
        this.job = job;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.docType = docType;
        this.docNumber = docNumber;
        this.agentName = agentName;
        this.loc = loc;
        this.bankName = bankName;
        this.bankNumber = bankNumber;
        this.userId = userId;
    }

    public Employee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrganId() {
        return organId;
    }

    public void setOrganId(Integer organId) {
        this.organId = organId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber == null ? null : docNumber.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber == null ? null : bankNumber.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}