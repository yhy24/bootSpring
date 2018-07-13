package com.tt.spring.controller;

import com.tt.spring.entity.User;
import com.tt.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/app")
    @ResponseBody
    public List<User> testBo(){
        List<User> list = userService.listFindAll();
        for(User user:list){
            System.out.println(user.getAge()+"->"+user.getId()+"->"+user.getInterest());
            System.out.println(user.getUsername()+""+user.getPhone());
        }
        return list;
    }
    @RequestMapping("/tt")
    @ResponseBody
    public String tt(){
        return "--->hello";
    }
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(){
        User user = new User();
        user.setAge(21);
        user.setMark("打铁男神MVP!");
        user.setPassword("824");
        user.setUsername("科比");
        userService.insetInfoUser(user);
        return "你好么?";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String ttss() {
        User user = new User();
        user.setId(4);
        userService.deleteIfoUser(user);
        return "删除成功!";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String updateT(){
        User user = new User();
        user.setSexly("男");
        user.setId(3);
        userService.updateInfo(user);
        return "更新成功!";
    }
    @RequestMapping(value = "/jsp",method = RequestMethod.GET)
    public String testJsp(){
        return "login";
    }
}
