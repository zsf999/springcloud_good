package com.jk.service;

import com.jk.pojo.Good;
import com.jk.pojo.GoodBrand;
import com.jk.pojo.GoodType;

import java.util.HashMap;
import java.util.List;

public interface GoodService {
    HashMap<String, Object> queryGood(Integer page, Integer rows);

    void addGood(Good good);

    void deleteGood(String id);

    Good queryGoodById(Integer id);

    List<GoodType> queryGoodTypellist();

    List<GoodBrand> queryGoodBrandllist();
}
