package com.github.kotlin.service.impl;

import com.github.kotlin.po.Article;
import com.github.kotlin.mapper.ArticleMapper;
import com.github.kotlin.service.ArticleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@Service
open class ArticleServiceImpl : ServiceImpl<ArticleMapper, Article>(), ArticleService {

}
