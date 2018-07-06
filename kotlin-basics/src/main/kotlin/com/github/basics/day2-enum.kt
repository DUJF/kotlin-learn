package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/5
 * @since JDK1.8
 */
/**
 * 枚举类
 *
 */
enum class Constans(val key: String, val number: String) {


  SPRING("spring", "1"),
  SUMMER("summer", "2"),
  AUTUMN("autumn", "3"),
  WINTER("winter", "4")
}

//调用枚举变量
fun main(args: Array<String>) {
  println(Constans.AUTUMN.name+Constans.SPRING.key+Constans.WINTER.number)
}

