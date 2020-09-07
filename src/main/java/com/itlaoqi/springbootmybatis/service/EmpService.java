package com.itlaoqi.springbootmybatis.service;

import com.itlaoqi.springbootmybatis.entity.Emp;
import com.itlaoqi.springbootmybatis.mapper.EmpMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmpService {
    @Resource
    private EmpMapper empMapper = null;

    public Emp findById(Integer empno){
        return empMapper.findById(empno);
    }

    public List<Map> findDepts(String dname , Float sal){
        Map param = new HashMap();
        param.put("pdname" , dname);
        param.put("psal" , sal);
        return empMapper.findDepts(param);
    }

    @Transactional(rollbackFor = Exception.class)
    public void create(Emp emp){
        empMapper.create(emp);
    }

    @Transactional(rollbackFor = Exception.class)
    public void update(Emp emp){
        empMapper.update(emp);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer empno){
        empMapper.delete(empno);
    }

}
