package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/5
 * @since JDK1.8
 */
//单例模式
object Singleton {

}

fun main(args:Array<String>){
  val a="a"
  val b="a"

  //=== 参照相等，只有指向同一对象时才是true
  //== 结构相等 内容一样就是true
  println(a==b)
  println(a===b)

}