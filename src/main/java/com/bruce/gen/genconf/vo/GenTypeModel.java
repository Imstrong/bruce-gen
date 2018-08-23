package com.bruce.gen.genconf.vo;

import java.util.HashMap;
import java.util.Map;

public class GenTypeModel {
    private String id;
    private String genTypeClass;
    private Map<String,String> params=new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenTypeClass() {
        return genTypeClass;
    }

    public void setGenTypeClass(String genTypeClass) {
        this.genTypeClass = genTypeClass;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
