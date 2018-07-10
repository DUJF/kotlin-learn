package com.github.kotlin.aop

import com.github.kotlin.annotation.Log
import com.github.kotlin.constant.SystemConstants
import com.github.kotlin.model.System
import com.github.kotlin.model.User
import com.github.kotlin.service.SystemService
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*


/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/9
 * @since JDK1.8
 */


@Component
@Aspect
class SystemLogAop {

  @Autowired
  private val systemService: SystemService? = null

  /**
   * @param joinPoint 前置参数
   */
  @After("execution(* com.github..*.*(..)) && @annotation(log)")
  fun doAfterAdvice(joinPoint: JoinPoint, log: Log) {
    logger.info("=========================================用户操作日志-后置通知开始执行......=========================================")
    //捕获方法执行结果
    var status: Int
    try {
      (joinPoint as ProceedingJoinPoint).proceed()
      status = 1
    } catch (e: Throwable) {
      status = 0
    }
    val system = System()
    system.createtime = Date()
    system.content = log.module
    system.status = status
    system.type = 1
    system.remark = log.operation
    addSystemLog(system)
    logger.info("=========================================用户操作日志-后置通知结束执行......=========================================")
  }

  /**
   *
   * Discription:[保存操作日志]
   * @param operationContent 操作内容
   */
  fun addSystemLog(system: System) {
    // 获取此次请求的request对象
    val request = (RequestContextHolder.getRequestAttributes() as ServletRequestAttributes).request
    val user = request.session.getAttribute(SystemConstants.CURRENT_USER) as User
    system.name = "${user.role}:${user.account}"
    systemService?.insert(system)
  }

  private val logger = LoggerFactory.getLogger(SystemLogAop::class.java)

}