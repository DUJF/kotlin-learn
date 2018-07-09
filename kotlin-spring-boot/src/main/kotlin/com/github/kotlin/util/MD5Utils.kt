package com.gitee.api.util

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import kotlin.experimental.and

object MD5Utils {

  /**
   * 获取MD5加密后的字符串
   *
   * @param str 明文
   * @return 加密后的字符串
   */
  fun getMD5(str: String): String {
    //创建MD5加密对象
    val md5: MessageDigest
    val md5Bytes: ByteArray
    val res: StringBuilder
    var temp: Int

    try {
      md5 = MessageDigest.getInstance("MD5")
    } catch (e: NoSuchAlgorithmException) {
      throw RuntimeException("MD5加密对象初始化失败。", e)
    }

    //进行加密
    md5.update(str.toByteArray())
    //获取加密后的字节数组
    md5Bytes = md5.digest()
    res = StringBuilder(32)
    for (md5Byte in md5Bytes) {
      temp = (md5Byte and 0xFF.toByte()).toInt()
      if (temp <= 0XF) { // 转化成十六进制不够两位，前面加零
        res.append("0")
      }
      res.append(Integer.toHexString(temp))
    }
    return res.toString()
  }
}