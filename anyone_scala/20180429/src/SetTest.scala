

object SetTest {
  def main(args: Array[String]): Unit = {
    var basket: Set[String] = Set()
    basket += "strawberry"
    basket += "watermelon"
    basket += "melon"
    basket += "coconut"
    
    println(basket)
  }
}