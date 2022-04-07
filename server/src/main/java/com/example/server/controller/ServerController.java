package com.example.server.controller;

import com.example.service.CommonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hongcunlin
 * server http interface
 */
@RestController
@RequestMapping("/server")
public class ServerController {
    /**
     * 公共服务
     */
    @Resource
    private CommonService commonService;

    /**
     * client方法
     *
     * @return 文案
     */
    @GetMapping("/word")
    public String clientWord() {
        return commonService.greetSb();
    }
}
