package com.example.service.impl;

import com.example.service.CommonService;
import org.springframework.stereotype.Service;

/**
 * 公共服务接口实现
 *
 * @author hongcunlin
 */
@Service
public class CommonServiceImpl implements CommonService {
    @Override
    public String greetSb() {
        return "hello";
    }
}
