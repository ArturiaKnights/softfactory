package com.mobile.service.impl;

import com.google.common.collect.Lists;
import com.mobile.common.ResponseCode;
import com.mobile.common.ServerResponse;
import com.mobile.dao.OrganMapper;
import com.mobile.pojo.Organ;
import com.mobile.service.IOrganService;
import com.mobile.vo.OrganDetailVo;
import com.mobile.vo.OrganMenu;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    @Override
    public ServerResponse<String> deleteOrgan(Integer organId) {

        if(organId == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }

        int count = organMapper.deleteByPrimaryKey(organId);
        if(count > 0){
            return ServerResponse.createBySuccessMessage("删除组织结构成功");
        }else{
            return ServerResponse.createByErrorMessage("删除组织结构失败");
        }

    }


    @Override
    public ServerResponse<OrganDetailVo> getOrganDetail(Integer organId) {

        if(organId == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }

        Organ organ = organMapper.selectByPrimaryKey(organId);
        if(organ == null){
            return ServerResponse.createByErrorMessage("查询组织详情失败,查不到该组织id");
        }

        OrganDetailVo organDetailVo = assembleOrganDetailVo(organ);
        return ServerResponse.createBySuccess(organDetailVo);

    }

    private OrganDetailVo assembleOrganDetailVo(Organ organ){
        OrganDetailVo organDetailVo = new OrganDetailVo();
        organDetailVo.setOrganId(organ.getOrganId());
        organDetailVo.setOrganHeigh(organ.getOrganHeigh());
        organDetailVo.setOrganName(organ.getOrganName());
        if(organ.getOrganType() != null){
            organDetailVo.setOrganType(organ.getOrganType());
        }
        organDetailVo.setOrganLoc(organ.getOrganLoc());
        organDetailVo.setOrganDir(organ.getOrganDir());
        organDetailVo.setOrganLinkman(organ.getOrganLinkman());
        organDetailVo.setOrganPhone(organ.getOrganPhone());
        organDetailVo.setOrganExplain(organ.getOrganExplain());


        if("".equals(organ.getOrganHeigh())){
            organDetailVo.setHighLevelOrgan("中国移动集团通信有限公司");
        }else{
            Organ heighLvOrgan = organMapper.selectParentNodeByHeighId(Integer.parseInt(organ.getOrganHeigh()));
            organDetailVo.setHighLevelOrgan(heighLvOrgan.getOrganName());
        }

        return organDetailVo;
    }

    /**
     * 加载所有菜单
     * @return
     */
    public ServerResponse<List<OrganMenu>> loadAllMenu(Integer organId){
        if(organId == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }

        List<OrganMenu> organMenus = Lists.newArrayList();
        List<Organ> organs = Lists.newArrayList();
        organMenus = getOrganMenuList(organId,organs,organMenus);

        return ServerResponse.createBySuccess(organMenus);
    }

    private List<OrganMenu> getOrganMenuList(Integer organId, List<Organ> organs, List<OrganMenu> organMenus) {
        Organ parentOrgan = organMapper.selectByPrimaryKey(organId);
        organs = organMapper.selectParallerChildNodeList(organId);

        for (Organ organ : organs) {

        }
        return null;
    }


    private OrganMenu assembleOrganMenu(Organ parentOrgan,List<Organ> childOrganList){
        OrganMenu organMenu = new OrganMenu();
        organMenu.setName(parentOrgan.getOrganName());
        organMenu.setSpread("false");
        //todo 数据库缺失href字段

        List<OrganMenu> organList = Lists.newArrayList();
        for (Organ organ : childOrganList) {
            OrganMenu tempMenu = new OrganMenu();

            tempMenu.setName(parentOrgan.getOrganName());
            tempMenu.setSpread("false");
            organList.add(tempMenu);
        }
        organMenu.setChildren(organList);
        return organMenu;
    }
}
