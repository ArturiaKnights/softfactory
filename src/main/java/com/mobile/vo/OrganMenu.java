package com.mobile.vo;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class OrganMenu implements Serializable{

    @JsonIgnore
    private Integer OrganId;

    private String name;

    //是否展开
    private String spread;

    private String href;

    private List<OrganMenu> children;

    public OrganMenu (String name, String spread, String href) {
        this.name = name;
        this.spread = spread;
        this.href = href;
    }

    public OrganMenu(String name, String spread, String href, List<OrganMenu> children) {
        this.name = name;
        this.spread = spread;
        this.href = href;
        this.children = children;
    }

    public OrganMenu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<OrganMenu> getChildren() {
        return children;
    }

    public void setChildren(List<OrganMenu> children) {
        this.children = children;
    }

    public Integer getOrganId() {
        return OrganId;
    }

    public void setOrganId(Integer organId) {
        OrganId = organId;
    }
}
