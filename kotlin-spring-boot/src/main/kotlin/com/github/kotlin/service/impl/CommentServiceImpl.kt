package com.github.kotlin.service.impl;

import com.github.kotlin.model.Comment;
import com.github.kotlin.mapper.CommentMapper;
import com.github.kotlin.service.CommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论 服务实现类
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@Service
open class CommentServiceImpl : ServiceImpl<CommentMapper, Comment>(), CommentService {

}
