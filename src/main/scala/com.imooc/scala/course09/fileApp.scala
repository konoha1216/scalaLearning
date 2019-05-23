package com.imooc.scala.course09

import scala.io.Source

object fileApp {
  def main(args: Array[String]): Unit = {

    val file = Source.fromFile("/Users/konoha/IdeaProjects/scalaLearning/src/main/scala/com.imooc/scala/course09/readfile.txt")(scala.io.Codec.UTF8)
    for (line <- file.getLines()){
      println(line)
    }

    //println()

    for (char <- file){
      println(char)
    }

    val netfile = Source.fromURL("http://www.baidu.com")
    for (line <- netfile.getLines()){
      println(line)
    }

  }
}
