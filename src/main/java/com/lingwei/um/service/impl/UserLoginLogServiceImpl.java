package com.lingwei.um.service.impl;

import com.lingwei.um.entity.UserLoginLog;
import com.lingwei.um.mapper.UserLoginLogMapper;
import com.lingwei.um.service.IUserLoginLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志表 服务实现类
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@Service
public class UserLoginLogServiceImpl extends ServiceImpl<UserLoginLogMapper, UserLoginLog> implements IUserLoginLogService {

}
