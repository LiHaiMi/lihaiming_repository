package cn.jy.controller;

import cn.jy.pojo.User;
import cn.jy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//表明是一个控制器
@RequestMapping("user")//该模板用户模板
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id") long id){
        return  this.userService.queryUserById(id);
    }

    @RequestMapping("test")
    @ResponseBody
    public  String test(){
        return  "hello user";
    }

}
