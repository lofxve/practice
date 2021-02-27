package com.lofxve.controller;

import com.lofxve.domain.User;
import com.lofxve.domain.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName DomeController
 * @Author lofxve
 * @Date 2021/1/9 17:49
 * @Version 1.0
 */
@Controller
public class DomeController {
    @RequestMapping(value = {"/domeController/dome01", "/domeController/dome02"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String dome01() {
        System.out.println("来了老弟");
        return "success";
    }

    // 简单类型
    @RequestMapping("/domeController/dome03")
    public String dome03(String username, String age) {
        System.out.println(username + "====" + age);
        return "success";
    }

    // 对象类型
    @RequestMapping("/domeController/dome04")
    public String dome04(User user) {
        System.out.println(user);
        return "success";
    }

    // 数组类型
    @RequestMapping("/domeController/dome05")
    public String dome05(String[] age) {
        for (String s : age) {
            System.out.println(s);
        }
        return "success";
    }

    // 集合类型
    @RequestMapping("/domeController/dome06")
    public String dome06(UserVo userVo) {
        System.out.println(userVo);
        return "success";
    }

    // 集合类型
    @RequestMapping("/domeController/dome07")
    public String dome07(@RequestParam("usernAme") String username,
                         @RequestParam("aGe") String age,
                         @RequestParam(defaultValue = "1") Integer pageNum,
                         @RequestParam(defaultValue = "10") Integer pageSize,
                         @RequestParam(required = false) String password,
                         @RequestParam("age") List<String> agelist) {
        System.out.println(username + "====" + age);
        System.out.println(pageNum + "====" + pageSize);
        if (password != null) {
            System.out.println(password);
        }
        for (String s : agelist) {
            System.out.println(s);
        }

        return "success";
    }

    // @RequestHeader
    @RequestMapping("/domeController/dome08")
    public String dome08(@RequestHeader Map map, @RequestHeader("cookie") String cookie) {
        System.out.println(map);
        System.out.println(cookie);
        return "success";
    }

    // 自定义类型转换
    @RequestMapping("/domeController/dome09")
    public String dome09(Date birthday) {
        System.out.println(birthday);
        return "success";
    }

    // 单文件上传
    @RequestMapping("/domeController/dome10")
    public String dome010(MultipartFile multipartFile) throws IOException {
        String newfile = UUID.randomUUID().toString() + multipartFile.getOriginalFilename();
        File file = new File("D:\\itheima\\lofxve\\spring\\day04_03_mvc\\src\\main\\resources\\uploadFile\\" + newfile);
        multipartFile.transferTo(file);
        return "success";
    }

    // 单文件上传
    @RequestMapping("/domeController/dome11")
    public String dome011(MultipartFile[] multipartFiles) throws IOException {
        for (MultipartFile multipartFile : multipartFiles) {
            String newfile = UUID.randomUUID().toString() + multipartFile.getOriginalFilename();
            File file = new File("D:\\itheima\\lofxve\\spring\\day04_03_mvc\\src\\main\\resources\\uploadFile\\" + newfile);
            multipartFile.transferTo(file);
        }
        return "success";
    }

    // 页面转发——简单方式
    @RequestMapping("/domeController/dome12")
    public String dome012(HttpServletRequest request) {
        request.setAttribute("name", "dome012");
        return "success";
    }

    // 页面转发——forward
    @RequestMapping("/domeController/dome13")
    public String dome013() {
        return "forward:/index2.jsp";
    }

    // 页面转发——原生api
    @RequestMapping("/domeController/dome14")
    public String dome014(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
        return "forward:/index2.jsp";
    }

    // 页面重定向——redirect
    @RequestMapping("/domeController/dome15")
    public String dome015() {
        return "redirect:/index2.jsp";
    }

    // 页面转发——原生api
    @RequestMapping("/domeController/dome16")
    public void dome016(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getContextPath() + "/index2.jsp");
    }

    // 页面重定向+转发
    @RequestMapping("/domeController/dome17")
    public String dome017() {
        return "redirect:/domeController/dome14";
    }

    @ResponseBody
    @RequestMapping("/domeController/dome18")
    public List<User> dome018(@RequestBody List<User> userList) {
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    @RequestMapping("/domeController/dome20")
    public String dome020() {
        System.out.println("页面已经到达dome020");
        return "success";
    }

    @RequestMapping("/domeController/dome21")
    public String dome021() {
        System.out.println("页面已经到达dome021");
        return "success";
    }
}