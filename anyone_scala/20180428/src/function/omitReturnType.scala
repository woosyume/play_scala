object omitReturnType {
  def main(args: Array[String]): Unit = {
    println("return value: " + name())
  }
  
  def name() = {
    val a = 10;
    a
  }
}