import ChecksumAccumulator.calculate

object Summer {
  // to run an application you need a standalone singleton object
  // with a main method that takes one parameter (Array[String]) and
  // returns a result type of Unit
  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
