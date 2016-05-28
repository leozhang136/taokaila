package com.taokaila.cms.system.impl;

import com.taokaila.cms.core.entity.TestUser;
import com.taokaila.cms.core.mapper.TestUserMapper;
import com.taokaila.cms.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-18
 * Time: 0:14
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TestUserMapper userMapper;

    @Override
    public String getUserInfo() {
        TestUser testUser = userMapper.selectByPrimaryKey(1);
        return testUser.getName();
    }
}
