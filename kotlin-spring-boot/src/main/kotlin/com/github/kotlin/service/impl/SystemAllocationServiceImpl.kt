package com.github.kotlin.service.impl;

import com.github.kotlin.model.SystemAllocation;
import com.github.kotlin.mapper.SystemAllocationMapper;
import com.github.kotlin.service.SystemAllocationService;
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
open class SystemAllocationServiceImpl : ServiceImpl<SystemAllocationMapper, SystemAllocation>(), SystemAllocationService {

}
