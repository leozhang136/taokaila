package com.taokaila.cms.test.cms;

import com.taokaila.cms.system.impl.UserServiceImpl;
import com.taokaila.cms.test.base.BaseSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-24
 * Time: 23:19
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
public class TestUserService extends BaseSpringTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void Test(){
//        TestUser testUser = userMapper.selectByPrimaryKey(1);
        String userInfo = userService.getUserInfo();
        System.out.println(userInfo);
    }
}
