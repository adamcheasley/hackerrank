object Solution {

  def sprout(cycles: Int): Int = {
    val realCycles = cycles + 1
    def loop(count: Int, acc: Int): Int = {
      if (count == realCycles)
        acc
      else if (realCycles == 0)
        acc
      else if (count % 2 == 0)
        loop(count + 1, acc + 1)
      else
        loop(count + 1, acc + acc)

    }
    loop(1, 1)
  }

  def main(args: Array[String]) {
    // var n = readInt
    // (1 to n) foreach(x=> println(sprout(readInt())))
    println(sprout(2))
  }

}
