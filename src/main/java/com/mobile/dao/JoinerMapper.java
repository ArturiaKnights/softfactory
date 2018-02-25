package com.mobile.dao;

import com.mobile.pojo.Joiner;

public interface JoinerMapper {
    int deleteByPrimaryKey(Integer joinerId);

    int insert(Joiner record);

    int insertSelective(Joiner record);

    Joiner selectByPrimaryKey(Integer joinerId);

    int updateByPrimaryKeySelective(Joiner record);

    int updateByPrimaryKey(Joiner record);
}