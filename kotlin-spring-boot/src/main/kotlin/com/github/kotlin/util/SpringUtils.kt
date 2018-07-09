package com.gitee.api.util

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

/**
 * 获取spring类的工具类
 *
 * @author dellll
 */
@Component
class SpringUtils : ApplicationContextAware {

  @Throws(BeansException::class)
  override fun setApplicationContext(applicationContext: ApplicationContext) {
    if (SpringUtils.applicationContext == null) {
      SpringUtils.applicationContext = applicationContext
    }
  }

  companion object {

    private var applicationContext: ApplicationContext? = null

    //获取applicationContext
    fun getApplicationContext(): ApplicationContext? {
      return applicationContext
    }

    //通过name获取 Bean.
    fun getBean(name: String): Any {
      return getApplicationContext()!!.getBean(name)
    }

    //通过class获取Bean.
    fun <T> getBean(clazz: Class<T>): T {
      return getApplicationContext()!!.getBean(clazz)
    }

    //通过name,以及Clazz返回指定的Bean
    fun <T> getBean(name: String, clazz: Class<T>): T {
      return getApplicationContext()!!.getBean(name, clazz)
    }
  }

}