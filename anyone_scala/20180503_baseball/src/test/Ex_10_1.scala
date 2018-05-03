package test

object Ex_10_1 {
  def convertInputs(input: String): Option[Seq[Int]] = {
    println("convertInoputs start")
    val REGEX = "([0-9])([0-9])([0-9])".r
    println("REGEX: " + REGEX)
    println("input is: " + input)
    input match {
      case REGEX(n1, n2, n3) => 
        if (n1 != n2 && n2 != n3 && n1 != n3)
          Some(Seq(n1.toInt, n2.toInt, n3.toInt))
        else 
          println("kokode none")
          None
      case _ => 
        println("koko?")
        None
    }
  }
}