package com.mobile.controller.portal;


import com.mobile.common.Const;
import com.mobile.common.ServerResponse;
import com.mobile.pojo.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @RequestMapping(value = "login.do")
    @ResponseBody
    public ServerResponse login(HttpSession session){
        session.setAttribute(Const.CURRENT_USER,new SysUser());
        return ServerResponse.createBySuccess("登陆成功");
    }
}
