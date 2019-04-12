package com.jk.pojo;

public class GoodType {
      private  Integer goodTypeId;
      private  String goodTypeName;
      private  Integer pid;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "GoodType{" +
                "goodTypeId=" + goodTypeId +
                ", goodTypeName='" + goodTypeName + '\'' +
                ", pid=" + pid +
                '}';
    }
}
