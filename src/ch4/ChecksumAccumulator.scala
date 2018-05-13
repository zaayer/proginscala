import scala.collection.mutable

// in Scala the default trait is public, so don't specify
// private if it is supposed to be private though

class ChecksumAccumulator {
  private var sum = 0

  // using braces here, but see below
  def add(b: Byte): Unit = {
    sum += b
  }

  // Don't need {} if it's a one-liner
  // don't need an explicit return if it's just calc'ing a value
  def checksum(): Int = ~(sum & 0xFF) + 1
}

// Singleton companion object
object ChecksumAccumulator {
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}
