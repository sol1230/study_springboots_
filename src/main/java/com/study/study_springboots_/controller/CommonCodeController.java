package com.study.study_springboots_.controller;

import com.study.study_springboots_.dao.CommonCodeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {
  @Autowired
  CommonCodeDao commonCodeDao;

  @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
  public ModelAndView list() {
    ModelAndView modelAndView = new ModelAndView();
    Object commonResult = commonCodeDao.getList();
    modelAndView.addObject("commonResult", commonResult);
    modelAndView.setViewName("commonCode/list");

    return modelAndView;
  }
}
