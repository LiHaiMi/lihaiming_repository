package cn.jy.service;

import cn.jy.mapper.EmpMapper;
import cn.jy.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional//事务
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    public  void  addEmp(Emp emp){
        empMapper.addEmp(emp);
    }

    public List<Emp> findAll() {
      return   empMapper.findAll();
    }

    public void Update(Emp emp) {
        empMapper.Update(emp);
    }

    public Emp findEmp(Integer eid) {
        return  empMapper.findEmp(eid);
    }
}
