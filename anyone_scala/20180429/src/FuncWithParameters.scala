

object FuncWithParameters {
  def main(args: Array[String]): Unit = {
    printlnStrings("string1", "string2", "string3")
  }
  
  def printlnStrings(args: String*) = {
    for (args <- args)  {
      println(args)
    }
  }
}