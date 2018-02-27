package com.mobile.service;


import com.mobile.common.ServerResponse;
import com.mobile.pojo.Organ;
import com.mobile.vo.OrganDetailVo;
import com.mobile.vo.OrganMenu;

import java.util.List;


public interface IOrganService {

    ServerResponse<String> saveOrUpdateOrgan(Organ organ);

    ServerResponse<String> deleteOrgan(Integer organId);

    ServerResponse<OrganDetailVo> getOrganDetail(Integer organId);

    ServerResponse<List<OrganMenu>> loadAllMenu(Integer organId);
}
