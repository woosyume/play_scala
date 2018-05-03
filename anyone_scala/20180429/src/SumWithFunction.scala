

object SumWithFunction {
  def main(args: Array[String]): Unit = {
    val result = calc(x => x * x, 2, 5)
    println("result: " + result)
  }
  
  def calc(f: Int => Int, start: Int, end: Int) {
    def loop(index: Int, sum: Int): Int = {
      println("index: " + index)
      if (index > end) sum
      else loop(index + 1, f(index) + sum)      
    }
    println("start: " + start)
    loop(start, 0)
  }
}