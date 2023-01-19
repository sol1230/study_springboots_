package com.study.study_springbootss.service;

import com.study.study_springbootss.beans.BoardBean;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class DataInfors {

  public HashMap<String, String> getSearchFormData() {
    HashMap<String, String> searchForm = new HashMap<String, String>();
    searchForm.put("search_key", "Search Title");
    searchForm.put("name", "sol!");
    searchForm.put("id", "sol1230");
    return searchForm;
  }

  public ArrayList<String> getTablesListWithString() {
    ArrayList<String> tablesListWithString = new ArrayList<String>();
    tablesListWithString.add("@mdo");
    tablesListWithString.add("@fat");
    tablesListWithString.add("@twitter");
    return tablesListWithString;
  }

  public HashMap<String, Object> getBundlesData() {
    DataInfors DataInfors = new DataInfors();
    HashMap<String, String> searchForm = DataInfors.getSearchFormData();
    ArrayList<String> tablesListWithString = DataInfors.getTablesListWithString();

    HashMap<String, Object> bundlesData = new HashMap<>();
    bundlesData.put("searchForm", searchForm);
    bundlesData.put("tablesListWithString", tablesListWithString);

    bundlesData.put("dataWithMemberBean", DataInfors.getDataWithMemberBean());
    bundlesData.put(
      "dataListWithBoardBean",
      DataInfors.getDataListWithBoardBean()
    );

    return bundlesData;
  }

  public BoardBean getDataWithMemberBean() {
    BoardBean boardBean = new BoardBean();
    boardBean.setTitle("Mark");
    boardBean.setContent("Otto");
    boardBean.setUserName("@mdo");

    return boardBean;
  }

  public ArrayList<BoardBean> getDataListWithBoardBean() {
    ArrayList<BoardBean> membersList = new ArrayList<>();
    BoardBean boardBean = new BoardBean();
    boardBean.setTitle("Mark");
    boardBean.setContent("Otto");
    boardBean.setUserName("@mdo");
    boardBean.setDate("22.11.11");
    membersList.add(boardBean);

    boardBean = new BoardBean();
    boardBean.setTitle("Jacob");
    boardBean.setContent("Thornton");
    boardBean.setUserName("@fat");
    boardBean.setDate("22.11.11");
    membersList.add(boardBean);

    boardBean = new BoardBean();
    boardBean.setTitle("Larry");
    boardBean.setContent("Bird");
    boardBean.setUserName("@twitter");
    boardBean.setDate("22.11.11");
    membersList.add(boardBean);

    return membersList;
  }

  public BoardBean getDataViewWithBoardBean(String title) {
    ArrayList<BoardBean> viewList = getDataListWithBoardBean();
    BoardBean boardBean = new BoardBean();
    for (int i = 0; i < viewList.size(); i++) {
      BoardBean view = viewList.get(i);
      if (title.equals(view.getTitle())) {
        boardBean.setTitle(view.getTitle());
        boardBean.setContent(view.getContent());
        boardBean.setUserName(view.getUserName());
        boardBean.setDate(view.getDate());
        break;
      } else {
        boardBean.setTitle("-");
        boardBean.setContent("-");
        boardBean.setUserName("-");
        boardBean.setDate("-");
      }
    }
    return boardBean;
  }

  public HashMap<String, Object> getDataByUid(String title) {
    ArrayList<BoardBean> viewList = getDataListWithBoardBean();
    HashMap<String, Object> hashMap = new HashMap<>();
    for (int i = 0; i < viewList.size(); i++) {
      BoardBean view = viewList.get(i);
      if (title.equals(view.getTitle())) {
        hashMap.put("title", view.getTitle());
        hashMap.put("content", view.getContent());
        hashMap.put("userName", view.getUserName());
        hashMap.put("date", view.getDate());
        break;
      } else {
        hashMap.put("title", "-");
        hashMap.put("content", "-");
        hashMap.put("userName", "-");
        hashMap.put("date", "-");
      }
    }
    return hashMap;
  }

  public HashMap<String, Object> getDataByParam(
    HashMap<String, String> params
  ) {
    HashMap<String, Object> viewData = new HashMap<>();
    viewData.put("title", params.get("title"));
    viewData.put("userName", params.get("userName"));
    viewData.put("content", params.get("content"));
    viewData.put("date", params.get("date"));
    return viewData;
  }
}
