package com.study.study_springboots_.controller;

import com.study.study_springboots_.dao.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  @Autowired
  HomeDao homeDao; // 인스턴스화

  @RequestMapping(value = { "", "/", "/main" })
  public String main() {
    int i = 0;
    return "main";
  }

  @RequestMapping(value = "/home")
  public void home() {
    Object result = homeDao.getList();
    int i = 0;
  }

  @RequestMapping(value = "/homejsp") // http://localhost:8080/homejsp
  public String homejsp() {
    int i = 0;
    return "home"; // /homejsp를 호출하면 home.jsp 화면에 보이도록
  }

  @RequestMapping(value = "/homehtml") // http://localhost:8080/homehtml
  public String homehtml() {
    int i = 0;
    return "home.html";
  }

  @RequestMapping(value = "/jstlformats")
  public String jstlformats() {
    int i = 0;
    return "jstl_formats";
  }
}
