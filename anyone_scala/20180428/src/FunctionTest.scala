

object FunctionTest {
  def main(args: Array[String]): Unit = {
    val result = sum(1, 2)
    println(result)
  }
  
  def sum(a: Int, b: Int) = {
    a + b
  }
}