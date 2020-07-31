package cn.jy.service;

import cn.jy.mapper.UserMapper;
import cn.jy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    //查询
    public User queryUserById(long id){
        return  this.userMapper.selectByPrimaryKey(id);
    }
    public  void  deleteUserById(long id){
        this.userMapper.deleteByPrimaryKey(id);
    }


}
