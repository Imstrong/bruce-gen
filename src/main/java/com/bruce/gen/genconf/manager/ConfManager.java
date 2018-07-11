package com.bruce.gen.genconf.manager;

import com.bruce.gen.genconf.vo.GenConfModel;
import com.bruce.gen.genconf.vo.ModuleConfModel;

import java.util.HashMap;
import java.util.Map;

//用于读取配置数据
public class ConfManager {
    private static ConfManager manager=new ConfManager();
    private ConfManager(){

    }
    public static ConfManager getInstance(){
        return manager;
    }
    //将配置数据缓存起来并保证只有一份实例
    private GenConfModel genConf=new GenConfModel();
    private Map<String,ModuleConfModel> moduleConfModelMap=new HashMap<>();

    public GenConfModel getGenConf() {
        return ConfManager.getInstance().getGenConf();
    }

    public Map<String, ModuleConfModel> getModuleConfModelMap() {
        return ConfManager.getInstance().getModuleConfModelMap();
    }

    private void readConf(){

    }
}
