package cn.jy.mapper;

import cn.jy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper//是mybatis
public interface UserMapper extends  tk.mybatis.mapper.common.Mapper<User> {



}
