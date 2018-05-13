// val means final - can't be reassigned
// var means non-final - can be reassigned

val msg = "Hello, world!"
var msg2: String = "Hello, mutable world!"
msg2 = "Goodbye, world!"

// function definition

def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}

println("Hello, world, from a script!")

// using arguments from command line
println("Hello, " + args(0) + "!")

// Loops in an imperative style
var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}

// foreach - more functional style
args.foreach(arg => println(arg))

// if a funciton literal consists of one statement that takes a single
// argument then you can avoid explicitly giving name/argument
args.foreach(println)

// there is a for syntax, but its more functional than imperative
for (arg <- args) {
  println(arg)
}
