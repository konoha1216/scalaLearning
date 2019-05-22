package com.imooc.scala.course07

object StringApp extends App {
  val s = "hello"
  val name = "konoha"

  // 插值操作
  println(s"hello: $name")

  // 多行字符串
  val b =
    """
      |this
      |is
      |a
      |multiple-rows
      |string
    """.stripMargin
  println(b)
}
