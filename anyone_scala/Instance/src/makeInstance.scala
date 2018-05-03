

object makeInstance {
  def main(args: Array[String]) : Unit = {
    val apple = new Fruit("apple")
    println(apple.name);
    println(apple.toString);
    println(apple.hashCode)
  }
}

//class Fruit(input: String) {
//  var name = input
//}

case class Fruit (name: String)