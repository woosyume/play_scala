

package instance

object multipleExtensionTest {
  def main(args: Array[String]): Unit = {
    val robot = new SuperMazinga
    println(robot.shoot)
  }

  
  class Mazinga extends Robot with M16 with Bazooka with Daepodong
  
  abstract class Robot {
    def shoot = "shoot"
  }
  
  trait M16 extends Robot {
    override def shoot = "m16..."
  }
  
  trait Bazooka extends Robot {
    override def shoot = "bazooka"
  }
  
  trait Daepodong extends Robot {
    override def shoot = "daepodong"
  }
  
  class SuperMazinga extends AnotherRobot with AnotherM16 with AnotherBazooks
  
  abstract class AnotherRobot {
    def shoot = "shoot!"
  }
  
  trait AnotherM16 extends AnotherRobot {
    override def shoot = super.shoot + " m16dfwef"
  }
  
  trait AnotherBazooks extends AnotherRobot {
    override def shoot = super.shoot + "/ bazooka"
  }
  
  trait AnotherDaepodong extends AnotherRobot {
    override def shoot = super.shoot + "/ daepodong"
  }