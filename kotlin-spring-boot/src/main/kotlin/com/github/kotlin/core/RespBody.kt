package com.github.kotlin.core

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

class RespBody<T> {
  /**
   * 错误码
   */
  var code: Int? = null
  /**
   * 提示信息
   */
  var msg: String? = null
  /**
   * 具体的内容
   */
  var data: Any? = null


  constructor() {}

  constructor(code: Int?, msg: String, data: T?) {
    this.code = code
    this.data = data
    this.msg = msg
  }

}