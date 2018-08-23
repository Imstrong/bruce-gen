package com.bruce.gen.genconf.implementor;

import com.bruce.gen.genconf.vo.GenTypeModel;

import java.util.Map;

public interface ThemeConfImplementor {
    /**
     * 根据themeId和注册的theme配置参数获取theme中定义的能生成的功能类型
     * @param themeId
     * @param params
     * @return
     */
    Map<String,GenTypeModel> getGenTypes(String themeId,Map<String,String> params);
    Map<String,String> getGenOutTypes(String themeId,Map<String,String> params);
    Map<String,String> getProviders(String themeId,Map<String,String> params);
}
