package com.imooc.scala.course07

// 1.匿名函数
// 2.科里化函数
// 3.高阶函数
// 4.词频统计样例
// 5.偏函数

object FunctionApp extends App {
  // 正常定义函数
  def add(x:Int) = {
    x+1
  }
  println(add(23))

  // 匿名函数
  (x:Int) => x+1

  // 可以把定义好的匿名函数赋值给一个变量或者一个函数
  val y = (x:Int) => x+1
  println(y(33))

  def add2 = (x:Int, y:Int) => x+y
  println(add2(43,53))

  // 他在词频统计里的应用如下
  // map(x=>(x,1))
  // 把一个单词转换为这个单词和1的一个元组，方便后面键值对的操作

  // 科里化函数：将原本需要两个参数的函数，拆开成分步骤读入这些参数
  // 正常的定义函数
  def sum(x:Int, y:Int) = x+y
  println(sum(23,32))
  // 科里化函数
  def sum2(x:Int)(y:Int) = x+y
  println(sum2(23)(32))

  // 高阶函数，map filter reduce foreach
  println("map")
  val l = List(1,2,3,4,5,6,7,8,9)
  l.map((x) => x+1).foreach(print)
  println()
  l.map(x => x+1).foreach(print) // 当只有一个参数的时候可以省略括号
  println()
  l.map(_ * 2).foreach(print) //也可以用占位符表示参数，连箭头都可以省略了
  println()

  println("filter")
  l.map(_ * 2).filter(_ > 8).foreach(print) //filter是保留其括号内返回true的那些元素
  println()
  l.map(_ * 2).filter(x => x>8).foreach(print)
  println()

  println("take")
  l.take(4).foreach(print)   //取前四个元素
  println()

  println("reduce")
  println(l.reduce(_+_))
  println(l.reduce(_-_))
  println(l.reduceLeft(_-_))
  println(l.reduceRight(_-_))
  // right是先做倒数第二个对倒数第一个操作，然后倒数第三个对前一个的结果做操作，以此类推

  println("fold") // fold是把前面那个小括号里的东西放置成最后一个元素
  println(l.fold(1)(_-_))
  println(l.foldLeft(1)(_-_))
  println(l.foldRight(2)(_-_))

  println("flatten")
  val f = List(List(1,2),List(3,4),List(5,6))
  println(f)
  println(f.flatten)
  f.map(x=>x).foreach(print)
  println()
  f.map(_.map(x=>x).foreach(print))
  println()
  f.map(_.map(x=>x)).foreach(print)
  println()
  f.flatMap(_.map(x=>x)).foreach(print)
  println()

  // 词频统计
  val txt = scala.io.Source.fromFile("/Users/konoha/IdeaProjects/scala-train/src/main/scala/com.imooc/scala/course07/wordcount.txt").mkString
  println(txt)
  val wordcount = List(txt)
  println(wordcount)
  wordcount.flatMap(_.split(" ")).map(x=>(x,1)).groupBy(_._1).map(t=>(t._1, t._2.size)).filter(_._2>1).foreach(println)


  // 偏函数
  // 函数里没有match的case语句
  println("partial function")
  def whichone:PartialFunction[String, String] = {
    case "young" => "bo"
    case "old" => "richard"
    case "stupid" => "tou"
    case "angry" => "ryan"
    case "lazy" => "mao"
  }
  println(whichone("angry"))


}
