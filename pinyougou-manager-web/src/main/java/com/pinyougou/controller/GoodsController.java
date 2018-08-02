package com.pinyougou.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods")
public class GoodsController {
    public GoodsController() {
        System.out.println("----------------------------------------执行构造方法-------------------------------------");
    }

    @Reference
    private GoodsService goodsService;
    @GetMapping("sayHello")
    public String sayHello(String name){
        String result = goodsService.sayHello(name);
        return result;
    }
}
