package com.jk.service.Impl;


import com.jk.pojo.Good;
import com.jk.mapper.GoodMapper;
import com.jk.pojo.GoodBrand;
import com.jk.pojo.GoodType;
import com.jk.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class GoodServiceImpl implements GoodService{
       @Autowired
    private GoodMapper goodMapper;
    //@Autowired
    //private RedisTemplate<String, Object> redisTemplate;
    @Override
    public HashMap<String, Object> queryGood(Integer page, Integer rows) {

        HashMap<String, Object> hashMap = new HashMap<String, Object>();
     /*   String  cachepower=page.toString()+2;
        List<Good> list =new ArrayList<>();
        int sum=0;
        //1先判断缓存中是否有
        Boolean hasKey = redisTemplate.hasKey(cachepower);
        if(hasKey){
            //2如果有从缓存中取出
            System.out.println("走缓存-------");
            list = (List<Good>) redisTemplate.opsForValue().get(cachepower);
            sum= (int) redisTemplate.opsForValue().get(cachepower+"q");
        }else{
            //3如果没有先去数据库查询
            System.out.println("走数据库-------");
             sum=goodMapper.querysum();
            int state=(page-1)*rows;
            int end =rows;
            list = goodMapper.queryGood(state,end);
            //再将查询结果存入缓存
            redisTemplate.opsForValue().set(cachepower, list);
            redisTemplate.opsForValue().set(cachepower+"q", sum);
            //设置过期时间
            redisTemplate.expire(cachepower, 30, TimeUnit.SECONDS);
            redisTemplate.expire(cachepower+"q", 30, TimeUnit.SECONDS);

        }*/

        int sum=goodMapper.querysum();
        int state=(page-1)*rows;
        int end =rows;
        List<Good> list1 = goodMapper.queryGood(state,end);
        hashMap.put("total", sum);
        hashMap.put("rows", list1);
        return hashMap;
    }

    @Override
    public void addGood(Good good) {
        if(good.getGoodId()==null){
            goodMapper.addGood(good);
        }else{
            goodMapper.updateGood(good);
        }
    }

    @Override
    public void deleteGood(String id) {
        goodMapper.deleteGood(id);
    }

    @Override
    public Good queryGoodById(Integer id) {
        Good good = goodMapper.queryGoodById(id);
        return good;
    }

    @Override
    public List<GoodType> queryGoodTypellist() {
        List<GoodType> goodTypes = goodMapper.queryGoodTypellist();
        return goodTypes;
    }

    @Override
    public List<GoodBrand> queryGoodBrandllist() {
        List<GoodBrand> list= goodMapper.queryGoodBrandllist();
        return list;
    }
}
