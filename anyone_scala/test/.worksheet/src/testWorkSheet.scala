object testWorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(15); 
  val test = 1;System.out.println("""test  : Int = """ + $show(test ));$skip(24); 
  
  var a = "variable";System.out.println("""a  : String = """ + $show(a ));$skip(18); 
  val b = "final";System.out.println("""b  : String = """ + $show(b ));$skip(11); 
  a = "re";$skip(33); 
  //b = "rere"
  
  var c = null;System.out.println("""c  : Null = """ + $show(c ));$skip(82); 
  // It's mandatory to initialize. If not, it'll be compile error.
  var d = None;System.out.println("""d  : None.type = """ + $show(d ));$skip(27); 
  
  var number: Int = 10;System.out.println("""number  : Int = """ + $show(number ));$skip(20); ;
  var number1 = 10;System.out.println("""number1  : Int = """ + $show(number1 ));$skip(121); ;
  
  // for sentence
  
                       for (x <- 1 until 10)
                       println ("value of x: " + x);$skip(105); 
                                                  
  for (x <- 1 to 10)
    println ("value of x: " + x);$skip(115); 
    
  // 2 loops
  for (x <- 1 until 5) {
    for (y <- 1 until 5) {
      println(x + " * " + y + " = " + x * y)
    }
  };$skip(134); 
    
  // better than 2 loops in Scala
  for (x <- 1 until 5 ; y <- 1 until 5) {
    println(x + " * " + y + " = " + x * y)
  };$skip(90); 
  
  // loop with a condition
  for (i <- 1 to 10 if (i % 2 == 0) ) {
  	  println(i)
  };$skip(112); val res$0 = 
  
  // loop with index
  for ((num, index) <- List.zipWithIndex) {
    println(num)
    println(index)
  };System.out.println("""res0: <error> = """ + $show(res$0))}
}
