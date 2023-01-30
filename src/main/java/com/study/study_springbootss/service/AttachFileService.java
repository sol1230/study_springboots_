package com.study.study_springbootss.service;

import com.study.study_springbootss.dao.AttachFileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachFileService {
  @Autowired
  AttachFileDao attachFileDao;

  public Object insertWithFilesAndGetList(Object dataMap) {
    // insert files
    Object result = this.insertOne(dataMap);
    result = this.getList(dataMap);
    return result;
  }

  public Object insertMulti(Object dataMap) { // dataMap은 브라우저에서 넘어옴 -> 파라미터로 표시
    String sqlMapId = "AttachFile.insertMulti";
    Object result = attachFileDao.getList(sqlMapId, dataMap);
    return result;
  }

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
    String sqlMapId = "AttachFile.selectListByUID";
    Object result = attachFileDao.getList(sqlMapId, dataMap);
    return result;
  }

  public Object getOne(Object dataMap) {
    String sqlMapId = "AttachFile.selectByUID";
    Object result = attachFileDao.getOne(sqlMapId, dataMap);
    return result;
  }

  public Object updateOne(Object dataMap) {
    String sqlMapId = "AttachFile.updateByUID";
    Object result = attachFileDao.updateOne(sqlMapId, dataMap);
    return result;
  }

  public Object insertOne(Object dataMap) {
    String sqlMapId = "AttachFile.insertWithUID";
    Object result = attachFileDao.insert(sqlMapId, dataMap);
    return result;
  }

  public Object delete(Object dataMap) {
    String sqlMapId = "AttachFile.deleteByUID";
    Object result = attachFileDao.delete(sqlMapId, dataMap);
    return result;
  }

  public Object deleteMulti(Object dataMap) {
    String sqlMapId = "AttachFile.deleteMultiByUIDs";
    Object result = attachFileDao.delete(sqlMapId, dataMap);
    return result;
  }
}
