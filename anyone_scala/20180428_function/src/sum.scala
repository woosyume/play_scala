

object sum {
  def main(args: Array[String]): Unit = {
//    val result = sum(1, 2)
//    print("result: " + result)
    
    dropship(people(5))
  }
  
  def people(n: Int) = {
    println("start to aaa")
    n
  }
  
//  def dropship(n: Int) = {
//    println("ready dropship")
//    println(n + " members")
//  }
  
  def dropship(n: => Int) = {
    println("ready dropship")
    println(n + " members")
  }
  
//  def sum(a: Int, b: Int) = a + b
  
}