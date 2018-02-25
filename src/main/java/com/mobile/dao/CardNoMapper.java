package com.mobile.dao;

import com.mobile.pojo.CardNo;

public interface CardNoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CardNo record);

    int insertSelective(CardNo record);

    CardNo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardNo record);

    int updateByPrimaryKey(CardNo record);
}