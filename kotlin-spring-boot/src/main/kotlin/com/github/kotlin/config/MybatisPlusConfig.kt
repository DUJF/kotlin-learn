package com.github.kotlin.config

import org.springframework.context.annotation.Configuration
import com.baomidou.mybatisplus.plugins.PaginationInterceptor
import org.springframework.context.annotation.Bean
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor
import org.mybatis.spring.annotation.MapperScan


/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/6/29
 * @since JDK1.8
 */

@Configuration
@MapperScan("com.github.kotlin.mapper")
class MybatisPlusConfig{

  /***
   * plus 的性能优化
   * @return
   */
  @Bean
  fun performanceInterceptor(): PerformanceInterceptor {
    val performanceInterceptor = PerformanceInterceptor()
    /*<!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->*/
    performanceInterceptor.maxTime = 1000
    /*<!--SQL是否格式化 默认false-->*/
    performanceInterceptor.isFormat = true
    return performanceInterceptor
  }

  /**
   * mybatis-plus 分页插件
   */

  @Bean
  fun paginationInterceptor(): PaginationInterceptor {
    val page = PaginationInterceptor()
    page.setDialectType("mysql")
    return page
  }


}