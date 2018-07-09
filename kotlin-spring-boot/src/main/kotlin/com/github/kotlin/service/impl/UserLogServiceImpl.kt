package com.github.kotlin.service.impl;

import com.github.kotlin.model.UserLog;
import com.github.kotlin.mapper.UserLogMapper;
import com.github.kotlin.service.UserLogService;
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
open class UserLogServiceImpl : ServiceImpl<UserLogMapper, UserLog>(), UserLogService {

}
