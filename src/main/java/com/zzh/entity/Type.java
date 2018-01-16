package com.zzh.entity;

/**
 * Created by zhenghua.zhang on 2018/1/16.
 */
public class Type {
    private Long typeId;
    private String typeName;

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Long getTypeId() {

        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }
}
