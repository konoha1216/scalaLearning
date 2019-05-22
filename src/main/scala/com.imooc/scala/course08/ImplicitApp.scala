package com.imooc.scala.course08

import java.io.File
import implicitFunctions._

object ImplicitApp extends App {

  val konoha = new person("konoha")
//  implicit def person2student(p:person):student = new student(p.name)
  konoha.study()
  konoha.play()

  val txt = new File("/Users/konoha/IdeaProjects/scala-train/src/main/scala/com.imooc/scala/course07/wordcount.txt")
//  implicit def file2strongfile(f:File):strongFile = new strongFile(f)
  println(txt.read())

}

class person(val name:String){
  def play() = {
    println(s"$name can play")
  }
}

class student(val name:String){
  def study() = {
    println(s"$name can study")
  }
}

class strongFile(val file:File){
  def read() = {
    scala.io.Source.fromFile(file.getPath).mkString
  }

}