package com.github.kotlin.core

import com.gitee.api.core.HttpStatusEnum



/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

object ResultUtils {

  fun success(any: Any): RespBody<*> {
    val respBody = RespBody<Any>()
    respBody.code = HttpStatusEnum.OK.code()
    respBody.msg = HttpStatusEnum.OK.reasonPhraseUS()
    respBody.data = any
    return respBody
  }


  fun success(): RespBody<*> {
    val respBody = RespBody<Any>()
    respBody.code = HttpStatusEnum.OK.code()
    respBody.msg = HttpStatusEnum.OK.reasonPhraseUS()
    return respBody
  }


  fun serverError(msg: String, `object`: Any): RespBody<*> {
    val respBody = RespBody<Any>()
    respBody.code = 500
    respBody.msg = msg
    respBody.data = `object`
    return respBody
  }

  /**
   * 返回未找到资源的错误，如数据记录不存在
   *
   * @param message 错误描述
   */
  fun <E> notFound(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.NOT_FOUND.code(), message,null)
  }

  /**
   * 返回资源冲突的错误，如密码错误
   *
   * @param message 错误描述
   */
  fun <E> conflict(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.CONFLICT.code(), message, null)
  }

  /**
   * 返回资源被锁定的错误，如当前用户被禁用
   *
   * @param message 错误描述
   */
  fun <E> locked(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.LOCKED.code(), message, null)
  }

  /**
   * 返回请求格式的错误，如json不合法
   *
   * @param message 错误描述
   */
  fun <E> unsupportedMediaType(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.UNSUPPORTED_MEDIA_TYPE.code(), message, null)
  }

  /**
   * 返回请求参数的错误，如缺少参数
   *
   * @param message 错误描述
   */
  fun <E> badRequest(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.BAD_REQUEST.code(), message, null)
  }

  /**
   * 返回请求拒绝的错误
   *
   * @param message 错误描述
   */
  fun <E> forbidden(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.FORBIDDEN.code(), message, null)
  }

  /**
   * 返回未认证的错误，如资源没有权限访问
   *
   * @param message 错误描述
   */
  fun <E> unAuthorized(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.UNAUTHORIZED.code(), message, null)
  }

  /**
   * 返回服务器的错误，如捕捉到执行异常
   *
   * @param message 错误描述
   */
  fun <E> serverError(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.INTERNAL_SERVER_ERROR.code(), message, null)
  }

  /**
   * 返回方法未实现的错误
   *
   * @param message 错误描述
   */
  fun <E> notImplemented(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.NOT_IMPLEMENTED.code(), message, null)
  }

  /**
   * 返回服务不可用的错误
   *
   * @param message 错误描述
   */
  fun <E> serverUnavailable(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.SERVICE_UNAVAILABLE.code(), message, null)
  }

  /**
   * 返回未知错误
   *
   * @param message 错误描述
   */
  fun <E> unknown(message: String): RespBody<E> {
    return RespBody<E>(HttpStatusEnum.UNPROCESSABLE_ENTITY.code(), message, null)
  }

  /**
   * 返回自定义错误
   *
   * @param message 错误描述
   */
  fun <E> customFail(code: Int?, message: String): RespBody<E> {
    return RespBody<E>(code, message, null)
  }
}