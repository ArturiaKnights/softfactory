package com.mobile.dao;

import com.mobile.pojo.Organ;

import java.util.List;

public interface OrganMapper {
    int deleteByPrimaryKey(Integer organId);

    int insert(Organ record);

    int insertSelective(Organ record);

    Organ selectByPrimaryKey(Integer organId);

    int updateByPrimaryKeySelective(Organ record);

    int updateByPrimaryKey(Organ record);

    //查询上级节点
    Organ selectParentNodeByHeighId(Integer organHeighId);

    //查询所有平行下级子节点
    List<Organ> selectParallerChildNodeList(Integer organId);

    List<Organ> selectRootAndParallerChildNodeList(Integer organId);
}