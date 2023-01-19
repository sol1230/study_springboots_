package com.study.study_springbootss.service;

import com.study.study_springbootss.dao.CommonCodeOurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonCodeOurService {
  @Autowired
  CommonCodeOurDao commonCodeOurDao;

  public Object deleteAndGetList(Object dataMap) {
    Object result = this.delete(dataMap); // delete function 불러오기
    result = this.getList(dataMap);
    return result;
  }

  public Object updateAndGetList(Object dataMap) {
    Object result = this.updateOne(dataMap);
    result = this.getList(dataMap);
    return result;
  }

  public Object insertAndGetList(Object dataMap) {
    Object result = this.insertOne(dataMap);
    result = this.getList(dataMap);
    return result;
  }

  public Object getList(Object dataMap) { // dataMap은 브라우저에서 넘어옴 -> 파라미터로 표시
    String sqlMapId = "CommonCodeOur.selectListByUID";
    Object result = commonCodeOurDao.getList(sqlMapId, dataMap);
    return result;
  }

  public Object getOne(Object dataMap) {
    String sqlMapId = "CommonCodeOur.selectByUID";
    Object result = commonCodeOurDao.getOne(sqlMapId, dataMap);
    return result;
  }

  public Object updateOne(Object dataMap) {
    String sqlMapId = "CommonCodeOur.updateByUID";
    Object result = commonCodeOurDao.updateOne(sqlMapId, dataMap);
    return result;
  }

  public Object insertOne(Object dataMap) {
    String sqlMapId = "CommonCodeOur.insertWithUID";
    Object result = commonCodeOurDao.insert(sqlMapId, dataMap);
    return result;
  }

  public Object delete(Object dataMap) {
    String sqlMapId = "CommonCodeOur.deleteByUID";
    Object result = commonCodeOurDao.delete(sqlMapId, dataMap);
    return result;
  }
}
