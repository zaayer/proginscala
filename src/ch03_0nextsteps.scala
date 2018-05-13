// instantiate objects and parameterize the initial value

val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for (i <- 0 to 2) {
  print(greetStrings(i))
}

// as an example of the behind the scenes acting that operators
// are methods - the below is equivalent

val greetStringsTwo = new Array[String](3)

greetStringsTwo.update(0, "Hello")
greetStringsTwo.update(1, ", ")
greetStringsTwo.update(2, "world!\n")

for (i <- 0.to(2)) {
  print(greetStringsTwo.apply(i))
}

// the below is more concise and is normally used

val numNames = Array("zero", "one", "two") // String type is inferred

// Lists are immutable in Scala

val oneTwoThree = List(1, 2, 3)

// List provides ::: for list concatenation - immutable so returns new list

val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

// :: is called cons - it prepends a new element to a list and then
// returns a new list - it's the right operand operating on the left
// in scala if it ends with a : it uses the right side otherwise
// it uses the left side

val twoFour = List(2, 4)
val oneTwoFour = 1 :: twoFour
println(oneTwoFour)

// Nil is how you specify an empty list so you could initialize
// a list using the method below

val twoThreeFour = 2 :: 3 :: 4 :: Nil
println(twoThreeFour)

// tuples are also immutable but can hold multiple types
// access with ._ because that allows multiple types
// note this syntax is 1-based NOT 0-based.
val pair = (99, "Luftballoons")
println(pair._1)
println(pair._2)

// Sets can be mutable or immutable - the below is immutable

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

// below it creates a mutable set

import scala.collection.mutable

val movieSet = mutable.Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)

// similarly Maps can be either mutable or immutable

val treasureMap = mutable.Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

// immutable is the default Map

val romanNumeral = Map(
  1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)

println(romanNumeral(4))
