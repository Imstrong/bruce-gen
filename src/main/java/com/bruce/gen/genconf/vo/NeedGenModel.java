package com.bruce.gen.genconf.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户注册的需要生成的模块配置bean
 */
public class NeedGenModel {
    private String id="";
    private String provider="";
    private String themeId="";
    private Map<String,String> params=new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getThemeId() {
        return themeId;
    }

    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }
}
