package com.jk.service;

import com.jk.pojo.Good;
import com.jk.pojo.GoodBrand;
import com.jk.pojo.GoodType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Component
public class GoodServiceHiHystric implements GoodService {
    @Override
    public HashMap<String, Object> queryGood(Integer page, Integer rows) {
        HashMap<String, Object> map = new HashMap();
            map.put("mess",111);
        return map;
    }

    @Override
    public void deleteGood(String id) {

    }

    @Override
    public List<Good> queryGoodById(Integer id) {
        Good good = new Good();
        good.setGoodName("网络异常");
        List<Good> list = new ArrayList<Good>();
        list.add(good);

        return list;
    }

    @Override
    public void addGood(Good good) {

    }

    @Override
    public List<GoodType> queryGoodTypellist() {
        return null;
    }

    @Override
    public List<GoodBrand> queryGoodBrandllist() {
        return null;
    }
}
