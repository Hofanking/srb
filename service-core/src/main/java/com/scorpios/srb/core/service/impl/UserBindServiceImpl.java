package com.scorpios.srb.core.service.impl;

import com.scorpios.srb.core.entity.UserBind;
import com.scorpios.srb.core.mapper.UserBindMapper;
import com.scorpios.srb.core.service.UserBindService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户绑定表 服务实现类
 * </p>
 *
 * @author scorpios
 * @since 2021-04-24
 */
@Service
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements UserBindService {

}
