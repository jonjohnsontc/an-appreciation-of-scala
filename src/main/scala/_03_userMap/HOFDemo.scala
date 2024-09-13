package gay.jons
package _03_userMap

import java.nio.file.{Path, Files}
import scala.jdk.CollectionConverters.*

object HOFDemo:
  def map[A, B](f: (B) => A, xs: List[B]): List[A] =
    for x <- xs yield f(x)

  def makeCute(filepath: String | Path): String =
    val len = filepath.toString.length
    val padLeft = StringBuilder()
    val padRight = StringBuilder()
    val padLength = 76 - len
    for (_ <- 0 to 32) do padLeft += ' '
    for (_ <- 33 to padLength) do padRight += ' '
    s"❤ ${padLeft}${filepath}${padRight} ❤"

  def main(args: Array[String]): Unit =
    val dir: List[Path] = Files.list(Path.of(".")).toList.asScala.toList
    val cuteDir = map(makeCute, dir)
    println("Here's the contents of your directory")
    println()
    for file <- cuteDir do println(file)
