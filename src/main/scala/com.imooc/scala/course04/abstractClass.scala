package com.imooc.scala.course04

object abstractClass {
  def main(args: Array[String]): Unit = {
    var person1 = new student()
    person1.name = "konoha"
    person1.age = 23
    println(person1.name)
    println(person1.age)
    person1.speak
  }

}

abstract class person{
  def speak
  var name:String
  var age:Int
}

class student extends person {
  override def speak= {
    println("can speak")
  }

  override var name: String = _
  override var age: Int = _
}