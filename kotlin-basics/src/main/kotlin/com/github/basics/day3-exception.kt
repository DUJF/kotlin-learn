package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/6
 * @since JDK1.8
 */

fun error(){
  throw NumberFormatException("aaaa")
}

fun main(args:Array<String>){

  try {
    error()
  } catch (e: NumberFormatException) {
    println("get Exception")
  }
}