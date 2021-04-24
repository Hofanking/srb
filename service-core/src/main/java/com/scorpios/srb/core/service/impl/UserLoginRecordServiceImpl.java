package com.scorpios.srb.core.service.impl;

import com.scorpios.srb.core.entity.UserLoginRecord;
import com.scorpios.srb.core.mapper.UserLoginRecordMapper;
import com.scorpios.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author scorpios
 * @since 2021-04-24
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
