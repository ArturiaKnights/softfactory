package com.mobile.pojo;

public class JoLever {
    private Integer joLevelId;

    private String joLevelName;

    private String joLevelExplain;

    public JoLever(Integer joLevelId, String joLevelName, String joLevelExplain) {
        this.joLevelId = joLevelId;
        this.joLevelName = joLevelName;
        this.joLevelExplain = joLevelExplain;
    }

    public JoLever() {
        super();
    }

    public Integer getJoLevelId() {
        return joLevelId;
    }

    public void setJoLevelId(Integer joLevelId) {
        this.joLevelId = joLevelId;
    }

    public String getJoLevelName() {
        return joLevelName;
    }

    public void setJoLevelName(String joLevelName) {
        this.joLevelName = joLevelName == null ? null : joLevelName.trim();
    }

    public String getJoLevelExplain() {
        return joLevelExplain;
    }

    public void setJoLevelExplain(String joLevelExplain) {
        this.joLevelExplain = joLevelExplain == null ? null : joLevelExplain.trim();
    }
}