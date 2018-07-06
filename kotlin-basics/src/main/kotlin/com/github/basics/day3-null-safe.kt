package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/6
 * @since JDK1.8
 */

//NPE nullpointException 空指针异常

fun main(args: Array<String>) {
  //kotlin 中空和非空引用是不同的
  println("---------")
  var str: String = "Ann"
  //str = null 编译会报错
  var str1: String? = "Ann"
  //str = null
  str1 = null
  println("---------")
  //安全调用 将str1 设置为null 不能直接调用 属性
//  str1.length
  println(str1?.length)
  println("---------")
  //!!   b!!会返回一个非空的 b 或者抛出一个 b 为空的 NPE
//  println(str1!!.length)


  println("---------")
  //Elvis 操作符 ?:
  println(str1?.length ?: -1)

  println("---------")
  //安全转换 as?
  val c = "123" as? Int
  println(c)
}