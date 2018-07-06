package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/6
 * @since JDK1.8
 */

//反射
val x = 1

fun main(args: Array<String>) {
  val cus = Constans::class
  println(cus)

  //::x 表达式评估为 KProperty<Int> 类型的属性，它允许我们使用 get() 读它的值或者使用名字取回它的属性
  println(::x.get())
  println(CurrentUser::account.name)
  println("______________")
//  val dyn: dynamic
}


