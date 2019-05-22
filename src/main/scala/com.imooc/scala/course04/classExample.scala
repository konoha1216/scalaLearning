package com.imooc.scala.course04

import jdk.javadoc.internal.doclets.toolkit.NestedClassWriter

object classExample {
  def main(args: Array[String]): Unit = {
    var konoha = new People()
    konoha.name = "konoha"
    konoha.age = 23
    konoha.showGender()
    println(konoha.eat)
    konoha.playGames("FM-2019")
  }
}

class People{
  var name:String = _
  var age:Int = 10
  private [this] var gender:String = "Male"

  def showGender() = {
    println(gender)
  }
  def eat() ={
    name + "can eat"
  }

  def playGames(gameName:String) ={
    println(name + "likes playing " + gameName)
  }

}
