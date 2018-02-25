package com.mobile.dao;

import com.mobile.pojo.JoLever;

public interface JoLeverMapper {
    int deleteByPrimaryKey(Integer joLevelId);

    int insert(JoLever record);

    int insertSelective(JoLever record);

    JoLever selectByPrimaryKey(Integer joLevelId);

    int updateByPrimaryKeySelective(JoLever record);

    int updateByPrimaryKey(JoLever record);
}