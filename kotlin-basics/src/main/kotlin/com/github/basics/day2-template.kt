package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/5
 * @since JDK1.8
 */
//泛型 嵌套类
class Car<T>(str: T){

  class Car1<E>(str: E)
}

//内部类 使用inner关键词
class Book(){

  inner class ChineseBook(){

  }
}
