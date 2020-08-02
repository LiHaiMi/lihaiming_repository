package cn.jy.mapper;

import cn.jy.pojo.Dept;
import cn.jy.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {

    List<Dept> findAll();

    Emp findEmp();
}
