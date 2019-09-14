package com.kejia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:控制器类
 * @DATE:CRETED: IN 19:53 2019/9/6
 * @MODIFY:
 */
@Controller
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMvc");
        return "kejia_successful";
    }
}
