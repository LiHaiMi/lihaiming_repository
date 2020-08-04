package cn.jiyu.service.userservice.service;

import cn.jiyu.service.userservice.mapper.UserMapper;
import cn.jiyu.service.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
