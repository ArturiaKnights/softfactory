package com.mobile.controller.backend;

import com.mobile.common.Const;
import com.mobile.common.ResponseCode;
import com.mobile.common.ServerResponse;
import com.mobile.pojo.Organ;
import com.mobile.pojo.SysUser;
import com.mobile.service.IOrganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/backend/organ")
public class OrganBackendController {

    @Autowired
    private IOrganService iOrganService;

    /**
     * 保存或更新组织结构
     * @param session
     * @param organ
     * @return
     */
    @RequestMapping(value = "saveOrgan.do")
    @ResponseBody
    public ServerResponse<String> saveOrgan(HttpSession session, Organ organ){
        SysUser user = (SysUser) session.getAttribute(Const.CURRENT_USER);

        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }

        //todo 检查是否管理员身份
        return iOrganService.saveOrUpdateOrgan(organ);
    }

    @RequestMapping(value = "deleteOrgan.do")
    @ResponseBody
    public ServerResponse<String> deleteOrgan(HttpSession session,Integer organId){
        SysUser user = (SysUser) session.getAttribute(Const.CURRENT_USER);

        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }

        //todo 检查是否管理员身份
        return iOrganService.deleteOrgan(organId);

    }


    @RequestMapping(value = "getDetail.do")
    @ResponseBody
    public ServerResponse getOrganDetail(HttpSession session,Integer organId){
        SysUser user = (SysUser) session.getAttribute(Const.CURRENT_USER);

        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }

        //todo 检查是否管理员身份
        return iOrganService.getOrganDetail(organId);
    }


    /**
     * 根据父节点查找所有平行子节点
     * @return
     */
    @RequestMapping(value = "loadAllMenu.do")
    @ResponseBody
    public ServerResponse loadAllMenu(HttpSession session,@RequestParam(value = "organId",defaultValue = "0") Integer organId){

        SysUser user = (SysUser) session.getAttribute(Const.CURRENT_USER);

        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }

        //todo 检查是否管理员身份
        return iOrganService.loadAllMenu(organId);
    }














}
