package com.github.kotlin.annotation

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/9
 * @since JDK1.8
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
annotation class Log(
    val module: String = "",
    val operation: String = "select"
)


