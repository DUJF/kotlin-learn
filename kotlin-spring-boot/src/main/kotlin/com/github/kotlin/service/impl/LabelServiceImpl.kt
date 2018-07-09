package com.github.kotlin.service.impl;

import com.github.kotlin.model.Label;
import com.github.kotlin.mapper.LabelMapper;
import com.github.kotlin.service.LabelService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签 服务实现类
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@Service
open class LabelServiceImpl : ServiceImpl<LabelMapper, Label>(), LabelService {

}
