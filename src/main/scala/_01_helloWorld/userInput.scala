package gay.jons
package _01_helloWorld

import scala.io.StdIn.readLine

@main def helloInteractive(): Unit =
  println("Please enter your name")
  val name: String = readLine()

  println("Hello, " + name + "!")
