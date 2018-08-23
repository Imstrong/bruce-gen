package com.bruce.gen.genconf;

public class GenConfFactory {
    private GenConfFactory(){

    }
    public static GenConfEbi createGenConf(){
        return new GenConfEbo();
    }
}
