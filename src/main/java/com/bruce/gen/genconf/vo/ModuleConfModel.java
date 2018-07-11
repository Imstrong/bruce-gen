package com.bruce.gen.genconf.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户自定义模块
 */
public class ModuleConfModel {
    /**
     * 用户需要生成模块的标识
     */
    private String moduleId="";
    /**
     * 生成该模块所使用的外部主题标识
     */
    private String useTheme="";
    /**
     * 需要生成的具体功能，key-功能标识，value-功能生成后多种输出类型标识的集合
     */
    private Map<String,List<String>> needGenTypes=new HashMap<>();
    /**
     * 生成模块所需的扩展数据
     */
    private Map<String,ExtendConfModel> extendConfs=new HashMap<>();

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getUseTheme() {
        return useTheme;
    }

    public void setUseTheme(String useTheme) {
        this.useTheme = useTheme;
    }

    public Map<String, List<String>> getNeedGenTypes() {
        return needGenTypes;
    }

    public void setNeedGenTypes(Map<String, List<String>> needGenTypes) {
        this.needGenTypes = needGenTypes;
    }

    public Map<String, ExtendConfModel> getExtendConfs() {
        return extendConfs;
    }

    public void setExtendConfs(Map<String, ExtendConfModel> extendConfs) {
        this.extendConfs = extendConfs;
    }
}
