

object PartitionTest {
  def main(args: Array[String]): Unit = {
    val o = List(1, 2, 3, 4)
    val n = o.partition(i => 1 < 3)
    println(n)
  }
}