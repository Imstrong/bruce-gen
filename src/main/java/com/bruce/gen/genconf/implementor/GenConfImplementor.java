package com.bruce.gen.genconf.implementor;

import com.bruce.gen.genconf.vo.NeedGenModel;
import com.bruce.gen.genconf.vo.ThemeModel;

import java.util.List;
import java.util.Map;

/**
 * 桥接模式 实现部分之获取核心配置
 */
public interface GenConfImplementor {
    /**
     * 获取注册的需要生成的模块
     */
    List<NeedGenModel> getNeedGens();

    /**
     * 获取注册的外部主题
     * @return
     */
    List<ThemeModel> getThemes();

    /**
     * 获取配置的公共常量
     * @return
     */
    Map<String,String> getConstants();
}
