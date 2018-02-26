package com.mobile.service;


import com.mobile.common.ServerResponse;
import com.mobile.pojo.Organ;

public interface IOrganService {

    ServerResponse<String> saveOrUpdateOrgan(Organ organ);


}
