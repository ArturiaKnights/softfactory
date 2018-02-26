package com.mobile.service.impl;

import com.mobile.common.ServerResponse;
import com.mobile.dao.OrganMapper;
import com.mobile.pojo.Organ;
import com.mobile.service.IOrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("iOrganService")
public class OrganServiceImpl implements IOrganService {

    @Autowired
    private OrganMapper organMapper;

    @Override
    public ServerResponse<String> saveOrUpdateOrgan(Organ organ) {

        if(organ != null){

            if(organ.getOrganId() != null){
                int count = organMapper.updateByPrimaryKeySelective(organ);
                if(count > 0){
                    return ServerResponse.createBySuccessMessage("更新组织结构成功");
                }
                return ServerResponse.createByErrorMessage("更新组织结构失败");
            }else{
                int count = organMapper.insert(organ);
                if(count > 0){
                    return ServerResponse.createBySuccessMessage("新增组织结构成功");
                }
                return ServerResponse.createByErrorMessage("新增组织结构失败");
            }
        }
        return ServerResponse.createByErrorMessage("新增或更新参数不正确");

    }


}
