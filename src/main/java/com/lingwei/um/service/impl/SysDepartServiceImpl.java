package com.lingwei.um.service.impl;

import com.lingwei.framework.core.Result;
import com.lingwei.um.entity.SysDepart;
import com.lingwei.um.mapper.SysDepartMapper;
import com.lingwei.um.service.ISysDepartService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 部门表结构 服务实现类
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@Service
public class SysDepartServiceImpl extends ServiceImpl<SysDepartMapper, SysDepart> implements ISysDepartService {

    @Autowired
    private SysDepartMapper sysDepartMapper;


    @Transactional
    public List<SysDepart>  selById(Integer id) {
        List<SysDepart> sysDeparts = sysDepartMapper.selById(id);
        System.out.println(sysDeparts);
        return sysDeparts;
    }
}
