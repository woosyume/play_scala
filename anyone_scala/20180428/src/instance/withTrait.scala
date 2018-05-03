
object withTrait {
    def main(args: Array[String]): Unit = {
      val flyingWhale = new Animal
      flyingWhale.swim
      flyingWhale.fly
      
      val eatingPig = new Animal2
      eatingPig.eat
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
    def eat
  }
  
  class Animal extends Flying with Swimming 
  
  class Animal2 extends Eating {
    var eat = print("eating")
  }
}