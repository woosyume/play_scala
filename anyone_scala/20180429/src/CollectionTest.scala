

object CollectionTest {
  def main(args: Array[String]): Unit = {
    var list = "a" :: "b" :: "c" :: Nil
    
    for(x <- 0 until list.size) println(list(x))
  }
}