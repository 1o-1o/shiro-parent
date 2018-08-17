package com.yz.shiro.dao;

import com.yz.shiro.entity.AreaTypeDic;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaTypeDicMapper extends DaoManager {
    int deleteByPrimaryKey(Integer id);

    int insert(AreaTypeDic record);

    int insertSelective(AreaTypeDic record);

    AreaTypeDic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AreaTypeDic record);

    int updateByPrimaryKey(AreaTypeDic record);
}