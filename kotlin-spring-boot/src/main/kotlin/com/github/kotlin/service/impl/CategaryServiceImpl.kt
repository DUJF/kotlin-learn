package com.github.kotlin.service.impl;

import com.github.kotlin.model.Categary;
import com.github.kotlin.mapper.CategaryMapper;
import com.github.kotlin.service.CategaryService;
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
open class CategaryServiceImpl : ServiceImpl<CategaryMapper, Categary>(), CategaryService {

}
