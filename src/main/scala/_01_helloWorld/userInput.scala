package gay.jons
package _01_helloWorld

import scala.io.StdIn.readLine
import io.AnsiColor._

@main def helloInteractive(): Unit =
  println("Please enter your name")
  val name: String = readLine()
  println(s"Hello, ${BOLD}${MAGENTA}${name}!${RESET}")
  println("I'm glad you came")
