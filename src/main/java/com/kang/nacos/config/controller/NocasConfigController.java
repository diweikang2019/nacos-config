package com.kang.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weikang.di
 * @date 2021/11/10 18:02
 */
@RestController
@RefreshScope
public class NocasConfigController {

    @Value("${config.value}")
    private String configValue;

    @Value("${scope.value}")
    private String scopeValue;

    @RequestMapping("/getNacosConfig")
    public String getNacosConfig() {
        return configValue + "<br>" + scopeValue;
    }
}
