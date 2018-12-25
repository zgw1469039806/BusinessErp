package com.lingwei.um.web;


import com.lingwei.framework.core.Result;
import com.lingwei.um.entity.SysDepart;
import com.lingwei.um.service.impl.SysDepartServiceImpl;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.lingwei.framework.core.BaseController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 部门表结构 前端控制器
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@RestController
@Api(value = "查询本部门下的所有会员信息")
@RequestMapping("/um/sysDepart")
public class SysDepartController extends BaseController {
    @Autowired
    private SysDepartServiceImpl sysDepartService;

    @ApiOperation(value = "根据id查询会员信息")
    @PostMapping("/selById")
    public List<SysDepart> selById(@ApiParam(value = "id") @RequestParam Integer id) {

        log.info("执行查询");

        return sysDepartService.selById(id);
    }

}

