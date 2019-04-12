package com.jk.pojo;

import java.io.Serializable;

public class Good  implements Serializable{
    private static final long serialVersionUID = 2822271970011528154L;
    private  Integer goodId;
      private  String  goodName;
      private Integer goodprice;
      private String goodImg;
      private  Integer goodTypeId;
      private  String goodTypeName;
      private Integer goodBrandId;
      private String goodBrandName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(Integer goodprice) {
        this.goodprice = goodprice;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    public Integer getGoodTypeId() {
        return goodTypeId;
    }

    public void setGoodTypeId(Integer goodTypeId) {
        this.goodTypeId = goodTypeId;
    }

    public String getGoodTypeName() {
        return goodTypeName;
    }

    public void setGoodTypeName(String goodTypeName) {
        this.goodTypeName = goodTypeName;
    }

    public Integer getGoodBrandId() {
        return goodBrandId;
    }

    public void setGoodBrandId(Integer goodBrandId) {
        this.goodBrandId = goodBrandId;
    }

    public String getGoodBrandName() {
        return goodBrandName;
    }

    public void setGoodBrandName(String goodBrandName) {
        this.goodBrandName = goodBrandName;
    }
}
