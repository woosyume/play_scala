

object MapTest {
  def main(args: Array[String]): Unit = {
    val map = Map(
        "first" -> "aa",
        "second" -> "bb",
        "third" -> 3,
        5 -> "ee"
        )
        
    println(map.isEmpty)
    println("whole map: " + map)
    println("keys: " + map.keys)
    println("values: " + map.values)
    
    println(map("first"))
  }
}