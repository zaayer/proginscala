// Operators are methods
val sumMore = 1.+(2)
println(sumMore)

val longSum = 1.+(2L)
println(longSum) // now it's a Long not Int

val s = "Hello, world!"
println(s indexOf 'o') // equivalent to s.indexOf('o')

// indexOf is also overloaded, second argument is where to start searching
// if multiple arguments you can still use "operator" style, but need ()
println(s indexOf ('o', 5))

// you can also use this call method for unary operators

println(-2.0)
// above is equivalent to
println((2.0).unary_-)

// note about the % operator - it is not IEEE 754 standard.
// the % operator uses truncating division, not ROUNDING like IEEE 754

println(11.0 % 4.0) // truncating
println(math.IEEEremainder(11.0, 4.0)) // rounding

// || and && are short-circuit
// | and & are NOT short-circuit
def salt() = { println("salt"); false }
def pepper() = { println("pepper"); true }

println(pepper() && salt())
println(salt() && pepper()) // only prints salt then stops
println(salt() & pepper()) // prints both salt and pepper

// operator precendence:
// (all other special characters)
// * / %
// + -
// :
// =!
// <>
// &
// ^
// |
// (all letters)
// (all assignment operators)

// an exception to the above is when using (operator)=

