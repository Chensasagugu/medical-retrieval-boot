package com.chen.medapi.controller;

import base.Result;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chen.medapi.entity.User;
import com.chen.medapi.service.IUserService;
import com.chen.medapi.util.JwtUtils;
import exception.RetrievalException;
import exception.RetrivalErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import request.LoginRequest;
import request.RegisterRequest;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aaashuai
 * @since 2023-04-08
 */
@Slf4j
@RestController
@RequestMapping("/medapi/user")
public class UserController {
    @Autowired
    IUserService userService;
    @Autowired
    JwtUtils jwtUtils;

    /**
     * 登录
     */
    @PostMapping("/login")
    public Result<String> login(@RequestBody LoginRequest loginRequest){
        User user = userService.getOne(new QueryWrapper<User>().eq("username", loginRequest.getUsername()));
        if(user!=null){
            if(loginRequest.getPassword().equals(user.getPassword())){
                log.info("登陆成功");
                String token =jwtUtils.generateToken(user.getUserId().longValue());
                return Result.frontOk(token);
            }else{
                throw new RetrievalException((RetrivalErrorCode.PASSWORD_ERROR));
            }
        }else{
            throw new RetrievalException(RetrivalErrorCode.USER_NOT_FOUND_ERROR);
        }
    }

    /**
     * 注册
     */
    @PostMapping("/register")
    public Result register(@RequestBody RegisterRequest request){
        User user = new User(request.getUsername(),request.getPassword());
        User find = userService.getOne(new QueryWrapper<User>().eq("username",user.getUsername()));
        if(find==null){
            //注册
            userService.save(user);
            log.info("注册成功");
            return Result.frontOk(null);
        }else {
            //用户已存在，无法注册
            throw new RetrievalException(RetrivalErrorCode.USER_EXISTS_ERROR);
        }
    }

}
