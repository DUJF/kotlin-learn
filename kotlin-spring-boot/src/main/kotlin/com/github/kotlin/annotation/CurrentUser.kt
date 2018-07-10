package com.github.kotlin.annotation

import com.github.kotlin.constant.SystemConstants
import java.lang.annotation.RetentionPolicy

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/9
 * @since JDK1.8
 */

/**
 * 在Controller的方法参数中使用此注解，该方法在映射时会注入当前登录的User对象
 */
//@Target(ElementType.PARAMETER)
//@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Target(AnnotationTarget.VALUE_PARAMETER) // 可用在方法的参数上
@kotlin.annotation.Retention()
annotation class CurrentUser(
    /**
     * 当前用户在session对象中的key
     */
    val value: String = SystemConstants.CURRENT_USER
)