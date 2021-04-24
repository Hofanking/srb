package com.scorpios.srb.core.service.impl;

import com.scorpios.srb.core.entity.UserInfo;
import com.scorpios.srb.core.mapper.UserInfoMapper;
import com.scorpios.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author scorpios
 * @since 2021-04-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
