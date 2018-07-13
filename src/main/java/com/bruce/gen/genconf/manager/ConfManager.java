package com.bruce.gen.genconf.manager;

import com.bruce.gen.genconf.implementor.GenConfImplementor;
import com.bruce.gen.genconf.vo.GenConfModel;
import com.bruce.gen.genconf.vo.ModuleConfModel;
import com.bruce.gen.genconf.vo.NeedGenModel;

import java.util.HashMap;
import java.util.Map;

//用于读取配置数据
public class ConfManager {
    private static ConfManager manager=null;
    private ConfManager(GenConfImplementor provider){
        readConf(provider);
    }
    public static ConfManager getInstance(GenConfImplementor provider){
        if(manager==null){
            return new ConfManager(provider);
        }
        return manager;
    }
    //将配置数据缓存起来并保证只有一份实例
    private GenConfModel genConf=new GenConfModel();
    private Map<String,ModuleConfModel> moduleConfModelMap=new HashMap<>();

    public GenConfModel getGenConf(GenConfImplementor provider) {
        return this.genConf;
    }

    public Map<String, ModuleConfModel> getModuleConfModelMap() {
        return this.moduleConfModelMap;
    }

    private void readConf(GenConfImplementor provider){
        //真正读取配置数据
        readGenConf(provider);
        for(NeedGenModel ngm:genConf.getNeedGens()){
            readModuleGenConf(ngm);
        }
    }
    private void readModuleGenConf(NeedGenModel ngm){
        ModuleConfModel mcm=new ModuleConfModel();
        mcm.setUseTheme(mcm.getUseTheme());
        mcm.setExtendConfs();
    }
    private void readGenConf(GenConfImplementor provider){
        genConf.setNeedGens(provider.getNeedGens());
        genConf.setThemes(provider.getThemes());
        genConf.setMapConstants(provider.getConstants());
    }
}
