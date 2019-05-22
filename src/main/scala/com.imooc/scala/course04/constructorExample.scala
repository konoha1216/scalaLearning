package com.imooc.scala.course04

object constructorExample {
  def main(args: Array[String]): Unit = {
    val person = new Person("konoha", 23)
    println(person.name + "," + person.age + "," + person.school)

    val person2 = new Person("Rothschild", 23, "Male")
    println(person2.name + "," + person2.age + "," + person2.school + "," + person2.gender)

    println()
    val student = new Student("Richard", 24, "CS")
    println(student.name + "," + student.age + "," + student.major + "," + student.school+ "," + student.gender)
  }

}
// 主构造器
class Person(val name:String, val age:Int){
  println("constrctor begins")
  val school = "USC"
  var gender:String = _

  // 附属构造器
  def this(name:String, age:Int, gender:String){
    this(name, age)
    this.gender = gender
  }
  println("constrcutor ends")

}

class Student(name:String, age:Int, val major:String) extends Person(name, age){
  println("constrctor2 begins")
  println("constrcutor2 ends")
  override val school: String = "XDU"

}