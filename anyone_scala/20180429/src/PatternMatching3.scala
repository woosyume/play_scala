

object PatternMatching3 {
  // Extractor
  
  def main(args: Array[String]): Unit = {
    val number1 = "080-360-2629"
    val number2 = "110"
    val number3 = "piglet"
    val numberList = List(number1, number2, number3)
    
    for (number <- numberList) {
      number match {
        case Emergency() => println("This is an emergency call.")
        case Normal(number) => println("This is a normal call. " + number)
        case _ => println("unknown call")
      }
    }
  }
}

object Emergency {
  def unapply(number: String): Boolean = {
    if (number.length() == 3 && number.forall(_.isDigit)) true
    else false
  }
}

object Normal {
  def unapply(number: String): Option[Int] = {
    println("number: " + number)
    try {
      var o = number.replaceAll("-", "")  
      println("o: " + o.toInt)
      Some(number.replaceAll("-", "").toInt)
    } catch {
      case _: Throwable => None
    }
  }
}