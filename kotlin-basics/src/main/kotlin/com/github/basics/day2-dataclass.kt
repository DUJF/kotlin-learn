package com.github.basics

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/5
 * @since JDK1.8
 */
/**数据类
 * 主构造函数应该至少有一个参数；

主构造函数的所有参数必须标注为 val 或者 var ；

数据类不能是 abstract，open，sealed，或者 inner ；

数据类不能继承其它的类（但可以实现接口）。

在 JVM 中如果构造函数是无参的，则所有的属性必须有默认的值，(参看Constructors);

data class User(val name: String = "", val age: Int = 0)
 */
data class People(val string: String)