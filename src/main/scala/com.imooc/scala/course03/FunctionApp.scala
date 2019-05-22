package com.imooc.scala.course03

object FunctionApp {
  def main(args: Array[String]): Unit = {
    println(add(23,32))
    println(three)
    sayHeLLO
    sayName()
    sayName("Rothschild")
    println(sum(1,2))
    println(sum(1,2,3))
    println(sum(1,2,3,4))

    println(1 to 10)
    println(1.to(10))
    println(Range(1,10))
    println(Range(1,10,3))

    for (i <- 1 to 10){
      print(i)
    }
    println()
    for (i <- Range(1,10)){
      print(i)
    }
    println()
    for (i <- 1.until(10)){
      print(i)
    }
    println()

    var roommates = Array("konoha", "Rothschild", "Richard", "MaoMao")
    for (roomate <- roommates){
      println(roomate)
    }
    roommates.foreach(roomate => println(roomate))

    var(num, total) = (100, 0)
    while(num != 0){
      total += num
      num -= 1
    }
    println(total)
  }

  def add(x:Int, y:Int):Int = {
    return x+y
  }
  def three() = 1+2
  def sayHeLLO(): Unit ={
    println("Hello")
  }
  def sayName(name:String = "konoha"): Unit ={
    println(name)
  }
  // 可变参数
  def sum(numbers:Int*):Int ={
    var result = 0
    for (number <- numbers) {
      result += number
    }
    return result
  }

}
