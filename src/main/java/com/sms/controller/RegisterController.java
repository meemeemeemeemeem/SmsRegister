package com.sms.controller;

import com.sms.dtos.Result;
import com.sms.serivce.RegeisterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author mei
 * @create 2023/2/8 16:28
 */
@RestController
@RequestMapping("/register")
@AllArgsConstructor
public class RegisterController {
    private final RegeisterService regeisterService;
    @GetMapping("reg")
    public Result<String> reg(){
        regeisterService.reg();
        return Result.ok("123");
    }




}
