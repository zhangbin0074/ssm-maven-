package com.ssm.dao;

import com.ssm.pojo.UserT;

public interface UserTMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    int insertSelective(UserT record);


    UserT selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserT record);


    int updateByPrimaryKey(UserT record);
}