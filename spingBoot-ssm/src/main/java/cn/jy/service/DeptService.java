package cn.jy.service;

import cn.jy.mapper.DeptMapper;
import cn.jy.pojo.Dept;
import cn.jy.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional//事务
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> findAll(){
        return  deptMapper.findAll();
    }

    public Emp findEmp() {

        return deptMapper.findEmp();
    }
}
