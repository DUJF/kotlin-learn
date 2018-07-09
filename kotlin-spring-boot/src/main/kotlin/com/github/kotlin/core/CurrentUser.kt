package com.github.kotlin.core

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

/**
 * 在Controller的方法参数中使用此注解，该方法在映射时会注入当前登录的User对象
 */
@Target(ElementType.PARAMETER)          // 可用在方法的参数上
@Retention(RetentionPolicy.RUNTIME)     // 运行时有效
annotation class CurrentUser(
    /**
     * 当前用户在session对象中的key
     */
    val value: String = SystemConstants.CURRENT_USER
)