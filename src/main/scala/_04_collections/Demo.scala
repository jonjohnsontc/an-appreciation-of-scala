package gay.jons
package _04_collections

import scala.::

// Scala has heterogenous collections, wonder what that looks like decompiled
val heteroArr: List[String | Double] = "this" :: 8.8 :: "is" :: 99.3 :: "a list" :: Nil

@main def demo(): Unit =
  for (item <- heteroArr) do println(item)