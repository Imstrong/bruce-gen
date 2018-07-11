package com.bruce.gen.genconf;

import com.bruce.gen.genconf.vo.GenConfModel;
import com.bruce.gen.genconf.vo.ModuleConfModel;

import java.util.Map;

public class GenConfEbo implements GenConfEbi {

    /**(
     * 获取相应配置数据
     * @return
     */
    @Override
    public GenConfModel getGenConf() {
        return null;
    }

    @Override
    public Map<String, ModuleConfModel> getModuleComfMap() {
        return null;
    }
}
