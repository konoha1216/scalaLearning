package com.imooc.scala.course08

object ImplicitClass extends App {

  implicit class calculator(x:Int){
    def add(y:Int) ={
      x+y
    }
  }

  println(23.add(32))

}
