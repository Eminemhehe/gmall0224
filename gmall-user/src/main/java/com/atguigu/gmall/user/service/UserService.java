package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;

import java.util.List;

/**
 * Created by wz on 2020/2/24.
 */


public interface UserService {

    List<UmsMember> getAll();

    List<UmsMemberReceiveAddress> getReceiveAdressByMemberId(String memberId);
}
