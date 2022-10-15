package com.li.controller;

import com.li.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Value("${testaaaaa}")
    private String testaaa;
    @Value("${enterprise.name}")
    private String t2;
    @Value("${enterprise.subject[0]}")
    private String t3_0;

//    定义一个环境,这个属性会将配置完全加载进来
    @Autowired
    private Environment environment;
    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){

        System.out.println(environment.getProperty("testaaaaa"));
        System.out.println(environment.getProperty("enterprise.name"));
        System.out.println(environment.getProperty("enterprise.subject[0]"));

        System.out.println(enterprise);

        System.out.println("id==>"+id+t2+t3_0+testaaa);
        return "{id:"+id+t2+t3_0+testaaa+"}";
    }
}
