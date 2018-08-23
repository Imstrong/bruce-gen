package com.bruce.gen.genconf.vo;

import com.bruce.gen.genconf.implementor.ThemeConfImplementor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 核心配置文件对应的bean
 */
public class GenConfModel {
    /**
     * 描述注册的多个用户需要生成的模块model
     */
    private List<NeedGenModel> needGens=new ArrayList<>();
    /**
     * 描述注册的多个主题的model
     */
    private List<ThemeModel> themes=new ArrayList<>();
    /**
     * 描述通用的常量定义的集合
     */
    private Map<String,String> mapConstants=new HashMap<>();

    public List<NeedGenModel> getNeedGens() {
        return needGens;
    }

    public void setNeedGens(List<NeedGenModel> needGens) {
        this.needGens = needGens;
    }

    public List<ThemeModel> getThemes() {
        return themes;
    }

    public void setThemes(List<ThemeModel> themes) {
        this.themes = themes;
    }

    public Map<String, String> getMapConstants() {
        return mapConstants;
    }

    public void setMapConstants(Map<String, String> mapConstants) {
        this.mapConstants = mapConstants;
    }

    public ThemeModel getThemeById(String themeId) {
        for(ThemeModel tm:this.themes){
            if(tm.getId().equals(themeId)){
                return tm;
            }
        }
        return new ThemeModel();
    }
}
