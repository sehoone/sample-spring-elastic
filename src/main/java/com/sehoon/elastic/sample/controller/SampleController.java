package com.sehoon.elastic.sample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Slf4j
@RestController
@RequestMapping("/api/sample")
public class SampleController {

  @GetMapping("/hello/{input}")
  public String sayHello(@PathVariable String input) {
    log.info("hello");
    return input;
  }

  @GetMapping("/modelandview/test")
  public ModelAndView modelandviewTest() {
    ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());

    mv.addObject("recordsTotal", "1");
    mv.addObject("recordsFiltered", "2");
    mv.addObject("data", "123");
    return mv;
  }
}
