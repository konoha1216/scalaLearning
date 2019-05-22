package com.imooc.scala.course06

import scala.util.Random

object matchApp extends App {
  println("example1:")
  val names = Array("konoha", "rothschild", "richard", "shawn")
  val name = names(Random.nextInt(names.length))

  name match {
    case "konoha" => println("14030288013")
    case "rothschild" => println("14030288016")
    case "richard" => println("14030288015")
    case "shawn" => println("14030288007")
    case _ => println("not match")
  }

  println()
  println("example2:")
  def lettergrade(point: Int) = {
    print(point + ": ")
    point match{
      case grade if grade < 70 && grade >= 60 => println("C")
      case grade if grade < 75 && grade >= 70 => println("C+")
      case grade if grade < 80 && grade >= 75 => println("B-")
      case grade if grade < 85 && grade >= 80 => println("B")
      case grade if grade < 90 && grade >= 85 => println("B+")
      case grade if grade < 95 && grade >= 90 => println("A-")
      case grade if grade < 100 && grade >= 95 => println("A")
      case _ => println("you need to take the course again")
    }
  }
  lettergrade(88)
  lettergrade(91)
  lettergrade(56)

  println()
  println("example3:")
  def lettergrade2(name: String, grade: Int) = {
    print(grade + ": ")
    grade match{
      case _ if grade < 70 && grade >= 60 => println("C")
      case _ if grade < 75 && grade >= 70 => println("C+")
      case _ if grade < 80 && grade >= 75 => println("B-")
      case _ if grade < 85 && grade >= 80 => println("B")
      case _ if grade < 90 && grade >= 85 => println("B+")
      case _ if grade < 95 && grade >= 90 => println("A-")
      case _ if grade < 100 && grade >= 95 => println("A")
      case _ if (name == "rothschild" || name == "richard" || name == "shawn") => println(name + ", you need to work harder and take the course again")
      case _ => println("you need to take the course again")
    }
  }

  lettergrade2("konoha", 89)
  lettergrade2("rothschild", 58)
  lettergrade2("ryan", 57)

  println()
  println("example4:")
  def greetings(people:Array[String]) = {
    people match {
      case Array("konoha") => println("Hi, konoha")
      case Array(x, y) => println("Hi, " + x + ", " + y)
      case Array("konoha", _*) => println("Hi, konoha and other friends")
      case _ => println("Hi, everyone")
    }
  }
  greetings(Array("konoha"))
  greetings(Array("rothschild", "richard"))
  greetings(Array("konoha", "rothschild", "richard"))
  greetings(Array("rothschild", "konoha")) // 这个case走的是default的那条路，因为Array数组是有序的

  println()
  println("example5:")
  def greetings2(people:List[String]) = {
    people match {
      case "konoha"::Nil => println("Hi, konoha")
      case x::y::Nil => println("Hi, " + x + ", " + y)
      case "konoha"::tail => println("Hi, konoha and other friends")
      case _ => println("Hi, everyone")
    }
  }
  greetings2("konoha" :: Nil)
  greetings2("rothschild" :: "richard"::Nil)
  greetings2("konoha" :: "rothschild"::Nil)
  greetings2("konoha"::"rothschild"::"richard" :: Nil)
  greetings2("rothschild" :: "konoha" :: Nil)

  println()
  println("example6:")
  def whichtype(obj:Any) = {
    obj match{
      case x:Int => println(x + ": type is Int")
      case x:String => println(x + ": type is String")
      case x:Map[_,_] => x.foreach(print) ; println(": type is Map")
      case _ => println("other types")
    }
  }
  whichtype(1)
  whichtype(1.2)
  whichtype("konoha")
  whichtype(Map("name" -> "konoha", "age" -> 23))

  println()
  println("example7:")
  def caseMatch(student:Student) = {
    student match{
      case undergraduate(name:String, age:Int) => println(name + ": undergraduate student, " + age + " years old")
      case graduate(name:String, age:Int) => println(name + ": graduate student, " + age + " years old")
      case other(name:String) => println(name + ": others")
      case _ => println("invalid person")
    }
  }
  class Student
  case class undergraduate(name:String, age:Int) extends Student
  case class graduate(name:String, age:Int) extends Student
  case class other(name:String) extends Student
  case class invalid() extends Student

  caseMatch(undergraduate("xiaoxiao", 22))
  caseMatch(graduate("konoha", 23))
  caseMatch(other("richard"))
  caseMatch(invalid())

  println()
  println("example8:")
  val grades = Map("konoha" -> "A", "rothschild" -> "B", "richard" -> "C")
  def getGrade(name:String) = {
    val grade = grades.get(name)
    grade match{
      case Some(grade) => println(name + ": " + grade)
      case None => println(name + ": grade doesn't exist")
    }
  }

  getGrade("konoha")
  getGrade("shaown")
}
