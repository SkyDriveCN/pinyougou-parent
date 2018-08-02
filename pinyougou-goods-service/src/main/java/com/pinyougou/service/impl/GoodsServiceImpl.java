package com.pinyougou.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Override
    public String sayHello(String name) {
        return "您好,"+name+".欢迎来是Dubbo的世界!测试Jrebel插件!";
    }
}
