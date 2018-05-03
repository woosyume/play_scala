package instance

object multipleExtensionTest2 {
  def main(args: Array[String]): Unit = {
    val robot = new SuperMazinga
    println(robot.shoot)
  }
  
  class SuperMazinga extends AnotherRobot with AnotherM16 with AnotherBazooks
  
  abstract class AnotherRobot {
    def shoot = "shoot"
  }
  
  trait AnotherM16 extends AnotherRobot {
    override def shoot = super.shoot + " m16"
  }
  
  trait AnotherBazooks extends AnotherRobot {
    override def shoot = super.shoot + " bazooka"
  }
  
  trait AnotherDaepodong extends AnotherRobot {
    override def shoot = super.shoot + " daepodong"
  }
}