package com.github.kotlin.core

import com.baomidou.mybatisplus.plugins.Page


/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/1
 * @since JDK1.8
 */

class RespPages<T>(page: Page<T>) {

  var total: Long = 0
  var size: Int = 0
  var pages: Long = 0
  var current: Int = 0
  var records: List<T>? = null
  var isAsc: Boolean = false


  init {
    this.total = page.getTotal()
    this.size = page.getSize()
    this.pages = page.getPages()
    this.current = page.getCurrent()
    this.records = page.getRecords()
    this.isAsc = page.isAsc()
  }
}