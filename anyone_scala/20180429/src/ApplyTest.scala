

object ApplyTest {
  class SomeClass {
    def apply(m: Int) = method(m)
    def method(i: Int) = i + i
    def method2(s: String) = 5
  }
  
  def main(args: Array[String]): Unit = {
    val something = new SomeClass
    
    println(something(2))
  }
}