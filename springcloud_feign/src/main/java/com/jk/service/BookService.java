package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("springcloud-produ")
public interface BookService {
    @GetMapping("query/{id}")
    public  String query(@PathVariable Integer id);
}
