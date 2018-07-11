package com.github.kotlin.service.impl;

import com.github.kotlin.po.Message;
import com.github.kotlin.mapper.MessageMapper;
import com.github.kotlin.service.MessageService;
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
open class MessageServiceImpl : ServiceImpl<MessageMapper, Message>(), MessageService {

}
