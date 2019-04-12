package com.jk.service;

import com.jk.pojo.Good;
import com.jk.pojo.GoodBrand;
import com.jk.pojo.GoodType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@FeignClient(value = "springcloud-producers",fallback = GoodServiceHiHystric.class)
public interface GoodService {
    @GetMapping("queryGood/{page}/{rows}")
    public HashMap<String ,Object> queryGood(@PathVariable("page") Integer page, @PathVariable("rows") Integer rows);
    @GetMapping("deleteGood/{id}")
    public void deleteGood( @PathVariable String id);
    @GetMapping ("queryGoodById/{id}")
    public List<Good> queryGoodById(@PathVariable("id") Integer id);
    @PostMapping("addGood")
    public void addGood(@RequestBody Good good);
    @GetMapping("queryGoodTypellist")
    public  List<GoodType>  queryGoodTypellist();
    @GetMapping("queryGoodBrandllist")
    public  List<GoodBrand>  queryGoodBrandllist();
}
