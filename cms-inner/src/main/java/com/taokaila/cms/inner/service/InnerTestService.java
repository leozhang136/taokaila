package com.taokaila.cms.inner.service;

import com.taokaila.cms.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-16
 * Time: 22:14
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Component
public class InnerTestService {

    @Autowired
    private UserService userService;

    public String getTestInfo(String name){
        String userInfo = userService.getUserInfo();
        return "你的要的名字是："+userInfo;
    }
}
