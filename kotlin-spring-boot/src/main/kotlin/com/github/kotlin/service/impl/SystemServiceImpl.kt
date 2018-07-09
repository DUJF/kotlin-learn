package com.github.kotlin.service.impl;

import com.github.kotlin.model.System;
import com.github.kotlin.mapper.SystemMapper;
import com.github.kotlin.service.SystemService;
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
open class SystemServiceImpl : ServiceImpl<SystemMapper, System>(), SystemService {

}
