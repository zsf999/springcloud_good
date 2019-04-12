package com.jk.controller;

import com.jk.pojo.Good;
import com.jk.pojo.GoodBrand;
import com.jk.pojo.GoodType;
import com.jk.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GoodController {
     @Autowired
    private GoodService goodService;
    @GetMapping("queryGood/{page}/{rows}")
    public HashMap<String ,Object> queryGood(@PathVariable("page") Integer page, @PathVariable("rows") Integer rows){
            HashMap<String ,Object> map= goodService.queryGood(page,rows);
            map.put("mess",200);
            return map;
    }

    @PostMapping("addGood")
    public void addGood(@RequestBody Good good){
        // restTemplate.postForObject("http://producer/addBook",book, List.class);
        goodService.addGood(good);
    }
    @GetMapping("deleteGood/{id}")
    public void deleteGood(@PathVariable String id){
        //restTemplate.delete("http://producer/deleteBook",id);
        goodService.deleteGood(id);
    }
    @GetMapping ("queryGoodById/{id}")
    public List<Good> queryGoodById(@PathVariable("id") Integer id){
        // Book forObject = restTemplate.postForObject("http://producer/queryUser",id,Book.class);
        List<Good> goods = new ArrayList<>();
        Good good1= goodService.queryGoodById(id);
        goods.add(good1);

        return goods;
    }
    @GetMapping("queryGoodTypellist")
    @ResponseBody
    public  List<GoodType>  queryGoodTypellist(){
        List<GoodType> goodtype= goodService.queryGoodTypellist();
        return goodtype;
    }
    @GetMapping("queryGoodBrandllist")
    @ResponseBody
    public  List<GoodBrand>  queryGoodBrandllist(){
        // Book forObject = restTemplate.postForObject("http://producer/queryUser",id,Book.class);
        List<GoodBrand> goodBrand= goodService.queryGoodBrandllist();

        return goodBrand;
    }
}
