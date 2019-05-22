package com.imooc.scala.course04

object applyExample {
  def main(args: Array[String]): Unit = {
    for(i<-1 to 10)
    {
      ApplyTest.plus
    }
    println(ApplyTest.count)

    val b = ApplyTest()     //直接调用类名调用的是object里的apply函数
    val c = new ApplyTest()  // 调用对象调用的是class里的apply函数
    println(c)
    c()
  }



}

class ApplyTest{
  println("class begins")
  println("class ends")
  def apply() = {
    println("class apply function")
  }
}

object ApplyTest{
  println("object begins")
  var count = 0
  def plus={
    count += 1
  }

  def apply() = {
    println("Object apply function")
    new ApplyTest
  }
  println("object ends")
}