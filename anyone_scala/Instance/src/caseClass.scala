

object caseClass {
  def main(args: Array[String]): Unit = {
    val apple = Fruit2("haha")
    print(apple)
  }
}

case class Fruit2(name: String)