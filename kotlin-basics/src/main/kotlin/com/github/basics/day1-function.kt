package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/4
 * @since JDK1.8
 */
//函数
fun hello() {
  println("hello world!!!")
}

//表达式无返回值
fun max(a: Int, b: Int) = if (a > b) a else b

//表达式带返回值 加？表示可以为空
fun min(a: Int, b: Int): Int? = if (a < b) a else b

fun main(args: Array<String>) {
  hello()

  //定义变量
  val num: Int = 1
  val num2: Double
  val number3 = 2
}