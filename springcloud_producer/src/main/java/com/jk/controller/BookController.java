package com.jk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("query/{id}")
    public  String query(@PathVariable Integer id){
        System.out.println("成功到达");
        return "成功到达生产者"+id;
    }

}
