package gay.jons
package _03_userMap

import java.nio.file.Path
import java.nio.file.Files
import scala.jdk.CollectionConverters.*

object HOFDemo {
  def map[A, B](f: (B) => A, xs: List[B]): List[A] =
    for x <- xs yield f(x)

  def makeCute(filepath: String | Path): String =
    val len = filepath.toString.length
    val padding = StringBuilder()
    val padLength = 76 - len
    for (_ <- 0 to padLength) do padding += ' '
    s"❤ ${filepath}${padding} ❤"

  def main(args: Array[String]): Unit =
    val dir: List[Path] = Files.list(Path.of(".")).toList.asScala.toList
    val cuteDir = map(makeCute, dir)
    println("Here's the contents of your directory")
    for file <- cuteDir do println(file)
}
