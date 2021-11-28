package com.felixwc.coc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * in order to learn java!
 * created at 2021/11/21 01:50
 *
 * @author wangchao
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @GetMapping("/hello")
    private String getPage(Model model){
        model.addAttribute("attrKey","attrValue");
        return "hello";
    }

}
