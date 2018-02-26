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
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "save.do")
    public ServerResponse<String> saveOrgan(HttpSession session, Organ organ){
        SysUser user = (SysUser) session.getAttribute(Const.CURRENT_USER);

        if(user == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }

        //todo 检查是否管理员身份
        return iOrganService.saveOrUpdateOrgan(organ);
    }

    






}
