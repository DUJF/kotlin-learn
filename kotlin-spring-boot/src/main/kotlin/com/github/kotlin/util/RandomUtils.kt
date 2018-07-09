package com.gitee.api.util

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

import java.util.Random

object RandomUtils {

  val allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val letterChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val upperLetterChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val lowerLetterChar = "abcdefghijklmnopqrstuvwxyz"
  val numberChar = "0123456789"
  val numberLowerLetterChar = "0123456789abcdefghijklmnopqrstuvwxyz"
  val numberUpperLetterChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  fun getRandomALLChar(n: Int): String {
    val sb = StringBuffer()
    val random = Random()
    for (i in 0 until n) {
      sb.append(allChar[random.nextInt(allChar.length)])
    }
    return sb.toString()
  }

  fun getRandomLetterChar(n: Int): String {
    val sb = StringBuffer()
    val random = Random()
    for (i in 0 until n) {
      sb.append(letterChar[random.nextInt(letterChar.length)])
    }
    return sb.toString()
  }

  fun getRandomUpperLetterChar(n: Int): String {
    val sb = StringBuffer()
    val random = Random()
    for (i in 0 until n) {
      sb.append(upperLetterChar[random.nextInt(upperLetterChar.length)])
    }
    return sb.toString()
  }

  fun getRandomLowerLetterChar(n: Int): String {
    val sb = StringBuffer()
    val random = Random()
    for (i in 0 until n) {
      sb.append(lowerLetterChar[random.nextInt(lowerLetterChar.length)])
    }
    return sb.toString()
  }

  fun getRandomNumberChar(n: Int): String {
    val sb = StringBuffer()
    val random = Random()
    for (i in 0 until n) {
      sb.append(numberChar[random.nextInt(numberChar.length)])
    }
    return sb.toString()
  }

  fun getRandomNumberLowerLetterChar(n: Int): String {
    val sb = StringBuffer()
    val random = Random()
    for (i in 0 until n) {
      sb.append(numberLowerLetterChar[random.nextInt(numberLowerLetterChar.length)])
    }
    return sb.toString()
  }

  fun getRandomNumberUpperLetterChar(n: Int): String {
    val sb = StringBuffer()
    val random = Random()
    for (i in 0 until n) {
      sb.append(numberUpperLetterChar[random.nextInt(numberUpperLetterChar.length)])
    }
    return sb.toString()
  }

  @JvmStatic
  fun main(Args: Array<String>) {
    val s1 = getRandomALLChar(5)
    val s2 = getRandomLetterChar(5)
    val s3 = getRandomLowerLetterChar(5)
    val s4 = getRandomNumberChar(6)
    val s5 = getRandomNumberLowerLetterChar(6)
    val s6 = getRandomNumberUpperLetterChar(6)
    val s7 = getRandomUpperLetterChar(6)
  }
}