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

val acc = new ChecksumAccumulator

acc.add(5)
acc.add(6)
acc.add(7)

println(acc.checksum())
