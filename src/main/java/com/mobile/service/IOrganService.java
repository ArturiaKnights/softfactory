package com.mobile.service;


import com.mobile.common.ServerResponse;
import com.mobile.pojo.Organ;
import com.mobile.vo.OrganDetailVo;


public interface IOrganService {

    ServerResponse<String> saveOrUpdateOrgan(Organ organ);

    ServerResponse<String> deleteOrgan(Integer organId);

    ServerResponse<OrganDetailVo> getOrganDetail(Integer organId);


}
