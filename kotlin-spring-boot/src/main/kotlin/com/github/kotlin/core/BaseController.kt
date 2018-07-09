package com.github.kotlin.core

import java.util.HashMap
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest


/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

open class BaseController {
  /**
   * 获取客户端ip
   *
   * @param request
   * @return
   */
  fun getRemoteIP(request: HttpServletRequest): String? {
    var ip = request.getHeader("x-forwarded-for")
    if (ip == null || ip!!.length == 0 || "unknown".equals(ip!!, ignoreCase = true)) {
      ip = request.getHeader("Proxy-Client-IP")
    }

    if (ip == null || ip!!.length == 0 || "unknown".equals(ip!!, ignoreCase = true)) {
      ip = request.getHeader("WL-Proxy-Client-IP")
    }

    // squid的squid.conf 的配制文件中forwarded_for项改为off时
    if (ip == null || ip!!.length == 0 || "unknown".equals(ip!!, ignoreCase = true)) {
      ip = request.getRemoteAddr()
    }

    // 多级反向代理
    if (ip != null && ip!!.indexOf(",") > 0 && ip!!.split(",".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray().size > 1) {
      ip = ip!!.split(",".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()[0]
    }
    return ip
  }

  companion object {


    /**
     * 根据名字获取cookie
     *
     * @param request
     * @param name    cookie名字
     * @return
     */
    fun getCookieByName(request: HttpServletRequest, name: String): Cookie? {
      val cookieMap = readCookieMap(request)
      return if (cookieMap.containsKey(name)) {
        cookieMap[name] as Cookie
      } else {
        null
      }
    }

    /**
     * 将cookie封装到Map里面
     *
     * @param request
     * @return
     */
    private fun readCookieMap(request: HttpServletRequest): Map<String, Cookie> {
      val cookieMap = HashMap<String, Cookie>()
      val cookies = request.getCookies()
      if (null != cookies) {
        for (cookie in cookies!!) {
          cookieMap[cookie.getName()] = cookie
        }
      }
      return cookieMap
    }
  }
}