package com.hello.controller;

import com.hello.entity.User;
import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Created by xuan on 2016/2/24.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAll(
            @RequestParam(defaultValue = "1", required = false) int currentPage,
            @RequestParam(defaultValue = "10", required = false) int pageSize,
            ModelMap modelMap
    ){
//        List<User> users = userService.getByPage(currentPage, pageSize);
//        for (User user : users){
//            System.out.println("id:" + user.getName() + " name:" + user.getName());
//        }
        modelMap.addAttribute("users", userService.getByPage(currentPage, pageSize));
        return "test/users";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(@RequestParam String name, @RequestParam String password){
        User user = new User();
        user.setName(name);
        user.setPassword(password);

        System.out.println(user.getId());
        userService.insert(user);
        System.out.println(user.getId());
        return "hello";
    }

}
