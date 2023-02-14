package com.study.study_springbootss.controller;

import com.study.study_springbootss.service.CommonCodeOurService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RestfulController {

  @RequestMapping(value = "/api/v1/helloworld", method = RequestMethod.GET)
  public String helloworld() {
    return "helloworld!";
  }

  // params - title:"learn ajax!", description:"we learn with ajax!"
  @RequestMapping(value = "/api/v1/requestParams", method = RequestMethod.GET)
  public Map requestParams(@RequestParam Map<String, Object> params) {
    Map<String, Object> result = new HashMap<String, Object>();
    result.putAll(params);
    result.put("id", "sol");
    return result;
  }

  @Autowired
  CommonCodeOurService commonCodeOurService;

  // http://127.0.0.1:5500/docs/ajaxs/jQuery_ajaxParamsReturnMap.html
  // currentPage : 1
  @RequestMapping(
    value = "/api/v1/requestParamsWithDB",
    method = RequestMethod.POST
  )
  public Map requestParamsWithDB(@RequestParam Map<String, Object> params) {
    params.put(
      "currentPage",
      Integer.parseInt((String) params.get("currentPage"))
    );
    params.put("pageScale", 10);

    Map<String, Object> resultMap = new HashMap<>();
    resultMap =
      (Map<String, Object>) commonCodeOurService.getListWithPagination(params);

    return resultMap;
  }
}
