package cn.jy.mapper;

import cn.jy.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface EmpMapper {
    void addEmp(@Param(value="emp")Emp emp);

    List<Emp> findAll();

    void Update(@Param(value="emp") Emp emp);

    Emp findEmp(Integer eid);
}
