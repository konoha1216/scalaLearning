package com.imooc.scala.course08

import java.io.File

object implicitFunctions extends App {

  implicit def person2student(p:person):student = new student(p.name)
  implicit def file2strongfile(f:File):strongFile = new strongFile(f)


}
