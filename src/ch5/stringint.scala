// the code below (string interpolation) allows you to embed
// an expression within a string literal

val name = "reader"

println(s"Hello, $name!")

// for longer statements use {}

println(s"The meaning of life is ${6 * 7}")

// there are two other interpolators by default raw and f

// raw doesn't use escape sequences
println(raw"There is no \\\\\\ escape!")

// f gives you printf functionality
println(f"${math.Pi}%.5f")

// if you don't provide a % it defaults to the same as s format
val pi = "Pi"
println(f"$pi is approximately ${math.Pi}%.8f")
