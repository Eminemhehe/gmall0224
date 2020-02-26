package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 *Creat by wz on 2020/2/24
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<UmsMember> getAll(){
        return userService.getAll();
    }

    /*根据用户id显示收货地址*/
    @RequestMapping("/getReceiveAdressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAdressByMemberId(String memberId){
        return userService.getReceiveAdressByMemberId(memberId);
    }
}
