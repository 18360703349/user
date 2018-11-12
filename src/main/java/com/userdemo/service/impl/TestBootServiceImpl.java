package com.userdemo.service.impl;

import com.userdemo.dao.SyspersonMapper;
import com.userdemo.domian.Sysperson;
import com.userdemo.service.TestBootService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hk on 2018/11/5.
 */
@Service("testBootService")
public class TestBootServiceImpl implements TestBootService {
    @Resource
    SyspersonMapper syspersonMapper;

    @Override
    public Sysperson getSysperson() {
        Sysperson sysperson = syspersonMapper.selectByPrimaryKey("1311061516356389621569df3e24e");
        return sysperson;
    }
}
