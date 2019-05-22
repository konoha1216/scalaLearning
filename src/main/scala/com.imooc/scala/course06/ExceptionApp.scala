package com.imooc.scala.course06

object ExceptionApp extends App {


  try {
    // 一般在这里读文件
    val i = 10 / 0
    println(i)
  } catch {
    case exception: ArithmeticException => println("除数不能为0喔...")
    case exception: Exception => println(exception.getMessage)
  }finally {
    //释放资源
    //在这里把文件close
  }
}
