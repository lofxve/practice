package com.lofxve.controller;

import com.lofxve.domain.Account;
import com.lofxve.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName AccountController
 * @Author lofxve
 * @Date 2021/1/11 22:26
 * @Version 1.0
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/accountController/findAll")
    public String findAll(HttpServletRequest request) {
        request.setAttribute("accounts", accountService.findAll());
        return "success";
    }
}