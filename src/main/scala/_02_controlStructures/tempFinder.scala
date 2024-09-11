package gay.jons
package _02_controlStructures

import scala.util.Random
//import java.util.Random

// positional arguments can be passed through to main as normal
// and will be interpreted as the type you provide
// that seems pretty nifty for small scripts
@main def findTemps(city: String): Unit =
// scala version
  val temp = Random.between(0.0, 100)
//  java version
//  val random = Random()
//  val temp = random.nextFloat() * 100
  println(f"Current temp in $city%s: $temp%.2f°")