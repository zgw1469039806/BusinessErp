package com.lingwei.um.web;


import com.lingwei.framework.core.Result;
import com.lingwei.um.service.impl.UserInfoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import com.lingwei.framework.core.BaseController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户基本信息表 前端控制器
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@Api("用户接口")
@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends BaseController {

    @Autowired
    private UserInfoServiceImpl userInfoService;


    @ApiOperation(value = "登录/前台、后台")
    @PostMapping("/login")
    public Result login(@ApiParam(value = "用户名") @RequestParam String name,
                        @ApiParam(value = "密码") @RequestParam String pwd) {
        log.info("执行login");
        return userInfoService.login(name, pwd);
    }
}

