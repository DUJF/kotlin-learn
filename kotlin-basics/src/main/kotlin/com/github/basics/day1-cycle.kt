package com.github.basics
import java.math.BigDecimal as jab

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/4
 * @since JDK1.8
 */

fun main(args: Array<String>) {
  val list = ArrayList<Int>()
  list.add(1)
  list.add(2)
  list.add(3)

  //for循环
  for (iten in list) {
    println(1)
  }
  println("----------")

  var i = 0
  //while循环
  while (i < list.size) {
    println(list.get(i))
    i++
  }
  println("----------")

  //do while 循环
  do {
    i--
    println(list.get(i))
  } while (i > 0)
  println("----------")

  //when 相当于switch case
  for (item in list) {
    when (item) {
      1 -> println("a")
      2 -> println("b")
      3 -> println("c")
    }
  }
  println("----------")

  //范围内 x..y
  for (item in list) {
    if (item in 1..10) {
      println("1-10")
    }
  }
  println("----------")

  //使用 in 操作符检查集合中是否包含某个对象
  if (i in list) {
    println("in")
  } else {
    println("out")
  }

  //使用 ！in 操作符检查集合中是否包含某个对象
  if (i !in list) {
    println("in")
  } else {
    println("out")
  }

  println("----------")
  //lambda表达式

  list.forEach { item -> println(item) }

  println("----------")

  val array= arrayOf(1,2,3)

  println("----------")

  val str="""
      list.forEach { item -> println(item) }
  """.trimIndent()

  println("----------")
  /**
   * 导包冲突时，可以用as 关键词重命名
   */

  //用 is 或者 !is 来判断值是否是某个类型
  list.forEach { item -> if (item !is Int) println("int") else println(" not int") }

}