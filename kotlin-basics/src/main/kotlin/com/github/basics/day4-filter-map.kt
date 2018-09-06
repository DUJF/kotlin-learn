package com.github.basics

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2018/9/6
 * @since JDK1.8
 */

fun filter(array: ArrayList<String>) {
  array.sort()
  println(array)
  array.filter {
    it.contains("n")
  }.forEach { println(it) }
}

fun map(array: ArrayList<String>) {
  val set = HashSet<String>()
  array.map {
    if (it.contains("m")) set.add(it)
    set
  }.forEach {
    println(it)
  }
}

fun main(args: Array<String>) {
  filter(arrayListOf("namme", "helo", "wanng", "aaa"))
}