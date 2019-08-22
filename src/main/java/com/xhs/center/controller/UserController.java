package com.xhs.center.controller;

import com.xhs.center.model.master.TUser;
import com.xhs.center.service.master.TUserService;
import com.xhs.center.utils.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author Bingove
 * @Date 2018/7/14 0014 上午 10:04
 */
@Controller
public class UserController {
    @Autowired
    private TUserService service;

    //判断用户户名是否存在
    @RequestMapping(value = "/usernamecheck.do", method = {RequestMethod.POST})
    @ResponseBody
    public ResultBean checkUsername(String username) {
        System.out.println("qwerty----------------------");
        if (service.queryByName(username) == null) {
            //不存在，可以注册
            return ResultBean.setSuccess("用户名可用");
        } else {
            return ResultBean.setError("用户名已经存在");
        }
    }

    //注册
    @RequestMapping(value = "/useradd.do", method = {RequestMethod.POST})
    @ResponseBody
    public ResultBean register(TUser user) {
        if (service.save(user)) {
            return ResultBean.setSuccess("注册成功");
        } else {
            return ResultBean.setError("注册失败");
        }
    }

    //登录
    @RequestMapping(value = "/userlogin.do", method = {RequestMethod.POST})
    @ResponseBody
    public ResultBean login(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            @RequestParam("role") int role, HttpSession session) {
        System.out.println(username + "-----------" + role);
        TUser user = service.queryByNOAndP(username, role);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                //登录成功
                session.setAttribute("user", user);
                return ResultBean.setSuccess("success");
            } else {
                return ResultBean.setError("登录名或者密码错误");
            }
        } else {
            return ResultBean.setError("登录名或者密码错误");
        }

    }

    //退出
    @RequestMapping(value = "")
    public String loginout(HttpSession session) {
        session.removeAttribute("user");
        return "stulogin";
    }

    //删除用户
    @RequestMapping(value = "/userdelete.do")
    @ResponseBody
    public ResultBean deleteUser(int id) {

        if (service.delete(id)) {

            return ResultBean.setSuccess("删除成功");
        } else {
            return ResultBean.setError("删除失败");
        }
    }

    //修改密码
    @RequestMapping(value = "/userupdate.do", method = {RequestMethod.POST})
    @ResponseBody
    public ResultBean updateUser(TUser user) {

        if (service.update(user)) {

            return ResultBean.setSuccess("删除成功");
        } else {
            return ResultBean.setError("删除失败");
        }
    }

}
