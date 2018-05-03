

object defaultParamerter {
  def main(args: Array[String]): Unit = {
    println("default value: " + default())
  }
  
  def default(a: Int = 4, b: Int = 5): Int = a + b
}