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
    // TODO: 2021/1/11
    @Autowired
    private AccountService accountService;

    @RequestMapping("/accountController/findAll")
    public String findAll(HttpServletRequest request) {
        request.setAttribute("accounts", accountService.findAll());
        return "list";
    }

    @RequestMapping("/accountController/toadd")
    public String toadd() {
        return "add";
    }

    @RequestMapping("/accountController/add")
    public String add(Account account) {
        accountService.save(account);
        return "redirect:/accountController/findAll";
    }
    @RequestMapping("/accountController/toUpdate")
    public String toUpdata(Integer aid, Model model) {
        Account account = accountService.findById(aid);
        model.addAttribute("account",account);
        return "update";
    }

    @RequestMapping("/accountController/update")
    public String update(Account account) {
        accountService.update(account);
        return "redirect:/accountController/findAll";
    }

    @RequestMapping("/accountController/delete")
    public String delete(Integer aid) {
        accountService.delete(aid);
        return "redirect:/accountController/findAll";
    }
}