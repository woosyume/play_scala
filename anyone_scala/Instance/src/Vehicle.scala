
object EX_4_1 {
  def main(args: Array[String]) : Unit = {
    val car = new Vehicle();
    print(car.price)
    print(car.hood)
  }
}

class Vehicle {
  var price: Int = 100000
  var hood: String = "expensive hood !"
}