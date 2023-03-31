package com.sms.controller;

import com.sms.entity.User;
import com.sms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author mei
 * @create 2023/2/8 16:28
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;





}
