package com.scorpios.srb.core.service.impl;

import com.scorpios.srb.core.entity.UserAccount;
import com.scorpios.srb.core.mapper.UserAccountMapper;
import com.scorpios.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author scorpios
 * @since 2021-04-24
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
