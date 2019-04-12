package com.jk.controller;

import com.jk.pojo.Good;
import com.jk.pojo.GoodBrand;
import com.jk.pojo.GoodType;
import com.jk.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("good")
public class GoodController {
      @Autowired
    private GoodService goodService;
      @RequestMapping("queryGood")
      @ResponseBody
    public HashMap<String ,Object> queryGood(Integer page,  Integer rows){
          HashMap<String ,Object> map= goodService.queryGood(page,rows);

          Integer mess = (Integer) map.get("mess");

               return map;



      }
    @PostMapping("addGood")
    @ResponseBody
    public void addGood(Good good){
        // restTemplate.postForObject("http://producer/addBook",book, List.class);
        goodService.addGood(good);
    }
    @RequestMapping("deleteGood")
    @ResponseBody
    public void deleteGood( String id){
        //restTemplate.delete("http://producer/deleteBook",id);
        goodService.deleteGood(id);
    }
    @RequestMapping("queryGoodById")
    @ResponseBody
    public Good queryGoodById(Integer id){
        // Book forObject = restTemplate.postForObject("http://producer/queryUser",id,Book.class);
        List<Good> good1= goodService.queryGoodById(id);
        Good good = good1.get(0);
        return good;
    }

    @GetMapping("queryGoodTypellist")
    @ResponseBody
    public  List<GoodType>  queryGoodTypellist(){
        // Book forObject = restTemplate.postForObject("http://producer/queryUser",id,Book.class);
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
