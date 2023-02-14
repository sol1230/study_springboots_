package com.study.study_springbootss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChartsController {

  @RequestMapping(
    value = "/charts/google_charts_scatter",
    method = RequestMethod.GET
  ) // "/board_our/edit"
  public ModelAndView edit(ModelAndView modelAndView) {
    modelAndView.setViewName("charts/google_charts_scatter");
    return modelAndView;
  }
}
