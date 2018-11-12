package com.userdemo.dao;

import com.userdemo.domian.Sysperson;

public interface SyspersonMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sysperson record);

    int insertSelective(Sysperson record);

    Sysperson selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sysperson record);

    int updateByPrimaryKeyWithBLOBs(Sysperson record);

    int updateByPrimaryKey(Sysperson record);
}