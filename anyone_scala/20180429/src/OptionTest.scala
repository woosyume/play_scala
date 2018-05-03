

object OptionTest {
  def main(args: Array[String]): Unit = {
    val students = Map(
      1 -> "seun",
      2 -> "jeongpal",
      3 -> "jeongbong"
    )
    
    val one = students.get(1)
    var four = students.get(4)
    
    println(one)
    println(four)
    println(one.get)
    println(four.getOrElse("no value"))
  }
}