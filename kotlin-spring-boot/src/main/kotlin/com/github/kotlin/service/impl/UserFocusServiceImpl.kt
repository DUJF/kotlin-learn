package com.github.kotlin.service.impl;

import com.github.kotlin.po.UserFocus;
import com.github.kotlin.mapper.UserFocusMapper;
import com.github.kotlin.service.UserFocusService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 关注用户 服务实现类
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@Service
open class UserFocusServiceImpl : ServiceImpl<UserFocusMapper, UserFocus>(), UserFocusService {

}
