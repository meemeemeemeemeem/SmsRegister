package com.sms.serivce.impl;

import cn.hutool.Hutool;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.sms.serivce.RegeisterService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author mei
 * @create 2023/3/31 10:45
 */
@Service
public class RegeisterServiceImpl implements RegeisterService {
    @Value("${sms.url}")
    private static final String url = null ;
    @Override
    public void reg() {
        HttpRequest post = HttpUtil.createPost(url);
    }
}
