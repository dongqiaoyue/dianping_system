package com.dongqiao.dianping.service.impl;

import com.dongqiao.dianping.dal.UserModelMapper;
import com.dongqiao.dianping.model.UserModel;
import com.dongqiao.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
