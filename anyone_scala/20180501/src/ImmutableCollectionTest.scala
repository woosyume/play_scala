

object ImmutableCollectionTest {
  def main(args: Array[String]): Unit = {
      val list = List(10,20,40,55)
  
  def foreach(list: List[Int]) = {
    def add(list: List[Int], total: Int): Int = {
      list match {
        case List() => total
        case List(item) => total + item
        case head :: tail => add(tail, total + head)
      }
      add(list, 0)
    }
  }
      println(foreach(list))
}
}