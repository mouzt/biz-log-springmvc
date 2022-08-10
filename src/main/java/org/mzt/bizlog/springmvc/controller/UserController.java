package org.mzt.bizlog.springmvc.controller;

import org.mzt.bizlog.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author muzhantong
 * create on 2022/5/4 10:42 PM
 */
@Controller
@ResponseBody
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user")
    public String user(@RequestParam("userId") String userId) {
        return userService.getUserName(userId);
    }
}
