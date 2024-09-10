package gay.jons
package _02_controlStructures

// positional arguments can be passed through to main as normal
// and will be interpreted as the type you provide
// that seems pretty nifty for small scripts
@main def findTemps(city: String, state: Int): Unit =
  if city == "Denver" then
    println("37.5 degrees celsius")
    println(s"And here's what I think about your $state, fuckboy")
  else if city == "Pawnee" then
    println("21 degrees celsius")
  else
    println("Move somewhere else bub")
