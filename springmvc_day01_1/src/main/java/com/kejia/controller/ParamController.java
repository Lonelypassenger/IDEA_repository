package com.kejia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 20:52 2019/9/6
 * @MODIFY:
 */
@Controller
@RequestMapping(path = "/param")
public class ParamController {
    @RequestMapping("/test")
    public String testParam(String username){
        System.out.println("你的用户名是："+username);
        return "kejia_successful";
    }
}
