package com.github.kotlin.service.impl;

import com.github.kotlin.po.User;
import com.github.kotlin.mapper.UserMapper;
import com.github.kotlin.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@Service
class UserServiceImpl : ServiceImpl<UserMapper, User>(), UserService {

}
