// Since it is annoying to put lots of escape sequences
// Scala gives you a raw string set by triple quotes

println("""Welcome to Ultamix 3000.
           Type "HELP" for help.""")

// the above will include the spaces, to avoid this you
// can use the stripMargin method on strings and use a pipe (|)

println("""|Welcome to Ultamix 3000.
           |Type "HELP" for help.""".stripMargin)
