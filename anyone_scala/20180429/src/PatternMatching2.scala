

object PatternMatching2 {
  case class Person(name: String, age: Int, rank: String)
  
  // object pattern matching
  def main(args: Array[String]): Unit = {
    val person1 = Person("Kim", 28, "CTO")
    val person2 = Person("Lee", 29, "CEO")
    val person3 = Person("Park", 30, "Employee")
    
    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
  }
  
  def matchAndHi(person: Person): Unit = person match {
    case Person("Kim", 28, "CTO") => println("Hi Kim!")
    case Person("Lee", 29, "CEO") => println("Hi Lee!")
    case Person("Park", 30, r) => println("Hi Park! lol: " + r)
    //Hi Kim!
    //Hi Lee!
    //Hi Park! lol: Employee
  }
}