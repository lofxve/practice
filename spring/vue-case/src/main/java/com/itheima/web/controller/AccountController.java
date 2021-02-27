package com.itheima.web.controller;

import com.itheima.domain.Account;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("/account")
@Controller
@ResponseBody
public class AccountController {

    public static List<Account> accounts = new ArrayList<Account>();

    static {
        accounts.add(new Account("1", "B01", 100d));
        accounts.add(new Account("2", "B02", 200d));
        accounts.add(new Account("3", "B03", 300d));
        accounts.add(new Account("4", "B04", 400d));
        accounts.add(new Account("5", "B05", 500d));
        accounts.add(new Account("6", "B06", 600d));
    }

    //查询
    @RequestMapping("/findAll")
    public List<Account> findAll() {
        return accounts;
    }

    //查询
    @RequestMapping("/findByAid")
    public Account findByAid(String aid) {
        for (Account acc : accounts) {
            if (StringUtils.equals(acc.getAid(), aid)) {
                return acc;
            }
        }
        return null;
    }

    //新增
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(@RequestBody Account account) {
        if (StringUtils.isEmpty(account.getAid())) {
            account.setAid(UUID.randomUUID().toString());
            accounts.add(account);
        } else {
            for (Account acc : accounts) {
                if (StringUtils.equals(acc.getAid(), account.getAid())) {
                    BeanUtils.copyProperties(account, acc);
                    break;
                }
            }
        }
        return "OK";
    }

    //删除
    @RequestMapping("/deleteByAid")
    public String deleteByAid(String aid) {
        for (Account acc : accounts) {
            if (StringUtils.equals(acc.getAid(), aid)) {
                accounts.remove(acc);
                return "OK";
            }
        }
        return null;
    }
}
