package com.zscdumin.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZSCDumin on 2018/3/29.
 * 作者邮箱：2712220318@qq.com
 */
@RestController
public class HelloControlller {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot!";
    }
}
