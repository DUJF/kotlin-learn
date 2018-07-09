package com.github.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApplication

fun main(args: Array<String>) {
//  runApplication<KotlinApplication>(*args)
  SpringApplication.run(KotlinApplication::class.java, *args)
  val line = "------------------------------------"
  println("$line\n http://localhost:8010/swagger-ui.html\n$line")

}
