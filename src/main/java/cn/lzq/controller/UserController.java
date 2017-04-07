package cn.lzq.controller;

import cn.lzq.Service.UserService;
import cn.lzq.entity.User;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhiqi.liu@yoho.cn on 2017/3/24.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/queryById")
    public User queryById(Integer id){
        User user = userService.queryById(id);
        System.out.println(user);
        return user;
    }

    @ResponseBody
    @RequestMapping("/queryUsers")
    public PageInfo<User> queryUsers(int pageNum){
        return userService.queryUsers(pageNum);
    }
}
