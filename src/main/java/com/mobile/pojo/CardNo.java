package com.mobile.pojo;

public class CardNo {
    private Integer id;

    private Integer firstno;

    private Integer middleno;

    private Integer endno;

    private Integer joinerid;

    private Integer sellerid;

    private Integer flag;

    public CardNo(Integer id, Integer firstno, Integer middleno, Integer endno, Integer joinerid, Integer sellerid, Integer flag) {
        this.id = id;
        this.firstno = firstno;
        this.middleno = middleno;
        this.endno = endno;
        this.joinerid = joinerid;
        this.sellerid = sellerid;
        this.flag = flag;
    }

    public CardNo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstno() {
        return firstno;
    }

    public void setFirstno(Integer firstno) {
        this.firstno = firstno;
    }

    public Integer getMiddleno() {
        return middleno;
    }

    public void setMiddleno(Integer middleno) {
        this.middleno = middleno;
    }

    public Integer getEndno() {
        return endno;
    }

    public void setEndno(Integer endno) {
        this.endno = endno;
    }

    public Integer getJoinerid() {
        return joinerid;
    }

    public void setJoinerid(Integer joinerid) {
        this.joinerid = joinerid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}