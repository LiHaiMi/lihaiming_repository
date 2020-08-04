package cn.jiyun.service.jiyunserviceconsumer.client;

import cn.jiyun.service.jiyunserviceconsumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallBack implements UserClient{
    @Override
    public User queryById(Long id) {
        User user=new User();
        user.setUsername("服务器繁忙，稍后从事");
        return user;
    }
}
