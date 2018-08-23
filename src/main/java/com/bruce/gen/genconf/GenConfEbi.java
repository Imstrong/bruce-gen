package com.bruce.gen.genconf;

import com.bruce.gen.genconf.vo.GenConfModel;
import com.bruce.gen.genconf.vo.ModuleConfModel;

import java.util.Map;

/**
 * 用于处理配置文件的接口
 */
public interface GenConfEbi {
    /**
     * 获取核心框架运行所需的配置数据
     * @return
     */
    GenConfModel getGenConf();

    /**
     * 获取需要生成的模块的配置
     * @return
     */
    Map<String,ModuleConfModel> getModuleComfMap();
}
