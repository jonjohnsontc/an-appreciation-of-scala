package gay.jons
package _04_collections

// Scala has heterogenous collections, wonder what that looks like decompiled
val heteroList: List[String | Double] = "this" :: 8.8 :: "is" :: 99.3 :: "a list" :: Nil
val someNames: List[String] = List("Rebecca", "Karl", "Anahi", "Steve", "NotFred")
type GarbagePlate = Boolean | String | Double | Int

@main def demo(): Unit =
  val more = heteroList ::: "more" :: 99.21 :: "linkedList" :: 21.11 :: "nonsense" :: Nil
  val stillMore = more ::: more
  val lazyList = LazyList(false, false, true, true, false, true)
  val andThisVec = Vector(2, 2, 3, 6, 7, 19)

  val lookAtThis = lazyList.concat(more)
  val bigPile: Vector[GarbagePlate] = andThisVec.concat(lookAtThis)
  for item <- bigPile do println(s"${item}, type: ${item.getClass.toString.drop(16)}")

  val first = someNames.headOption.getOrElse("Fred")
  println(s"First on the list is ${first}")