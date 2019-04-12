package com.jk.mapper;

import com.jk.pojo.Good;
import com.jk.pojo.GoodBrand;
import com.jk.pojo.GoodType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodMapper {
    int querysum();

    List<Good> queryGood(@Param("st") int state, @Param("end") int end);

    void addGood(Good good);

    void updateGood(Good good);

    void deleteGood(String goodName);

    Good queryGoodById(Integer id);

    List<GoodType> queryGoodTypellist();
    @Select("select * from t_goodbrand")
    List<GoodBrand> queryGoodBrandllist();
}
