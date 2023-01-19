package com.study.study_springbootss.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Repository
@Component
public class CommonCodeOurDao {
  @Autowired
  private SqlSessionTemplate sqlSessionTemplate; // DB와 MapperXML 연결

  public Object getList(String sqlMapId, Object dataMap) {
    Object result = sqlSessionTemplate.selectList(sqlMapId, dataMap);
    return result;
  }

  public Object getOne(String sqlMapId, Object dataMap) {
    Object result = sqlSessionTemplate.selectOne(sqlMapId, dataMap);
    return result;
  }

  public Object updateOne(String sqlMapId, Object dataMap) {
    Object result = sqlSessionTemplate.update(sqlMapId, dataMap);
    return result;
  }

  public Object insert(String sqlMapId, Object dataMap) {
    Object result = sqlSessionTemplate.insert(sqlMapId, dataMap);
    return result;
  }

  public Object delete(String sqlMapId, Object dataMap) {
    Object result = sqlSessionTemplate.delete(sqlMapId, dataMap);
    return result;
  }
}
