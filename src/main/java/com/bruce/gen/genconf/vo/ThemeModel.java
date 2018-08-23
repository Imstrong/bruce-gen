package com.bruce.gen.genconf.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * 主题配置
 */
public class ThemeModel {
    private String id;
    private String location;
    private Map<String,GenTypeModel> genTypes=new HashMap<>();
    private Map<String,String> genOutTypes=new HashMap<>();
    private Map<String,String> providers=new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<String, GenTypeModel> getGenTypes() {
        return genTypes;
    }

    public void setGenTypes(Map<String, GenTypeModel> genTypes) {
        this.genTypes = genTypes;
    }

    public Map<String, String> getGenOutTypes() {
        return genOutTypes;
    }

    public void setGenOutTypes(Map<String, String> genOutTypes) {
        this.genOutTypes = genOutTypes;
    }

    public Map<String, String> getProviders() {
        return providers;
    }

    public void setProviders(Map<String, String> providers) {
        this.providers = providers;
    }
}
