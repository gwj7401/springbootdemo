package org.csu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yanghaokun guoweijiang
 * @create 2020-07-21 - 13:34
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/index")//http://localhost:8888/demo/index
    @PostMapping
    public String demo(){

        return "index.html";
    }
}
