package com.lingwei.um.service.impl;

import com.lingwei.um.entity.UserToken;
import com.lingwei.um.mapper.UserTokenMapper;
import com.lingwei.um.service.IUserTokenService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登陆token验证 服务实现类
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@Service
public class UserTokenServiceImpl extends ServiceImpl<UserTokenMapper, UserToken> implements IUserTokenService {

}
