

object MapTest2 {
  def main(args: Array[String]): Unit = {
    var student1Ban = Map(
      1 -> "고지용",
      2 -> "김말자",
      3 -> "김말이",
      4 -> "김이불",
      5 -> "이재현",
      6 -> "정미쳐",
      7 -> "차수홍",
      8 -> "최예림",
      9 -> "최한잔"
    )
    student1Ban += (10 -> "전학생")  
    student1Ban -= (9) 
    
    var student2Ban = Map(
      11 -> "고세용",
      12 -> "권육삼",
      13 -> "김융찬",
      14 -> "김참치"
    )
    
    var students = student1Ban ++ student2Ban
    
    students.foreach(i => print(i))
    
    println()
    
    val callee = 5
    println("who's " + callee + "?")
    
    println(students.contains(callee))
  }
}