package gay.jons
package _02_controlStructures

import scala.annotation.switch
import scala.util.Random
import scala.util.CommandLineParser
//import java.util.Random

enum Scale:
  case Fahrenheit, Celsius

given CommandLineParser.FromString[Scale] with
  def fromString(s: String): Scale =
    // @switch annotation provides compile-time warning
    // if switch can't be compiled to a tableswitch or
    // lookupswitch, which are better for performance
    val scale = (s: @switch) match
      case "F" | "f" | _ => Scale.Fahrenheit
      case "C" | "c" => Scale.Celsius
    scale

// positional arguments can be passed through to main as normal
// and will be interpreted as the type you provide
// that seems pretty nifty for small scripts
@main def findTemps(city: String, scale: Scale): Unit =
  val temp = Random.between(0.0, 100)
  if scale == Scale.Fahrenheit then
    println(f"Current temp in $city%s: $temp%.2f° Farenbellows")
  else
    println(f"I don't know that is mate")