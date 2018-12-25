package com.lingwei.um.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.lingwei.framework.core.Result;
import com.lingwei.framework.core.ResultGenerator;
import com.lingwei.framework.utils.RedisUtil;
import com.lingwei.um.entity.UserInfo;
import com.lingwei.um.entity.UserToken;
import com.lingwei.um.mapper.UserInfoMapper;
import com.lingwei.um.service.IUserInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lingwei.um.vo.UserInfoCondition;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;
/**
 * <p>
 * 用户基本信息表 服务实现类
 * </p>
 *
 * @author 马浩然
 * @since 2018-12-14
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserTokenServiceImpl userTokenService;

    public Result login(String name, String pwd) {
        logger.info("执行logo");
        UserInfo userInfo = this.selectOne(new EntityWrapper<UserInfo>()
                .eq("user_name", name)
                .eq("user_password", pwd));
        logger.info(userInfo + "");

        if (userInfo != null) {
            //生成唯一识别码
            String token = UUID.randomUUID().toString().replace("-", "");
            UserToken userToken = new UserToken();
            UserToken userTokenConditon = userTokenService.selectOne(new EntityWrapper<UserToken>()
                    .eq("uid", userInfo.getId()));
            userToken.setUid(userInfo.getId());
            userToken.setToken(token);
            if (userTokenConditon != null) {
                userTokenService.insert(userToken);
            } else {
                userToken.setId(userTokenConditon.getId());
                userTokenService.updateById(userToken);
            }
            UserInfoCondition userInfoCondition = new UserInfoCondition();
            BeanUtils.copyProperties(userInfo, userInfoCondition);
            userInfoCondition.setToken(token);
            userInfoCondition.setPwd(null);
            return ResultGenerator.genSuccessResult(userInfoCondition);
        } else {
            return ResultGenerator.genFailResult();
        }
    }
}
