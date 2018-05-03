

package instance

object abstractClassTest {
  def main(args: Array[String]): Unit = {
    val pig = new Pig
    pig.eat
    pig.shout
    pig.fly
  }
  
  class Pig extends Animal with Flying with Eating {
    def shout = println("shouting")
  }
  
  abstract class Animal {
    def shout
  }
  
  trait Swimming {
    def swim = println("swimming")
  }
  
  trait Flying {
    def fly = println("flying")
  }
  
  trait Running {
    def run = println("running")
  }
  
  trait Eating {
    def eat = println("eating")
  }
}