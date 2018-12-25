package com.lingwei.um.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.lingwei.framework.core.Result;
import com.lingwei.um.entity.MemberInfo;
import com.lingwei.um.mapper.MemberInfoMapper;
import com.lingwei.um.service.IMemberInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@Service
public class MemberInfoServiceImpl extends ServiceImpl<MemberInfoMapper, MemberInfo> implements IMemberInfoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Result selAll(Integer id) {
        logger.info("执行查询");

        return null;
    }
}
