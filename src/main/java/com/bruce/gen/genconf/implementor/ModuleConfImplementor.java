package com.bruce.gen.genconf.implementor;

import com.bruce.gen.genconf.vo.ExtendConfModel;
import com.bruce.gen.genconf.vo.ModuleConfModel;

import java.util.List;
import java.util.Map;

public interface ModuleConfImplementor {
    ModuleConfModel getBaseModuleConfModel(Map<String,String> param);
    Map<String,List<String>> getNeedGenTypes(Map<String,String> param);
    Map<String,ExtendConfModel> getExtends(Map<String,String> param);
}
