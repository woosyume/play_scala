object testWorkSheet {
  println("Welcome to the Scala worksheet")
  val test = 1
  
  var a = "variable"
  val b = "final"
  a = "re"
  //b = "rere"
  
  var c = null
  // It's mandatory to initialize. If not, it'll be compile error.
  var d = None
  
  var number: Int = 10;
  var number1 = 10;
  
  // for sentence
  
                       for (x <- 1 until 10)
                       println ("value of x: " + x)
                                                  
  for (x <- 1 to 10)
    println ("value of x: " + x)
    
  // 2 loops
  for (x <- 1 until 5) {
    for (y <- 1 until 5) {
      println(x + " * " + y + " = " + x * y)
    }
  }
    
  // better than 2 loops in Scala
  for (x <- 1 until 5 ; y <- 1 until 5) {
    println(x + " * " + y + " = " + x * y)
  }
  
  // loop with a condition
  for (i <- 1 to 10 if (i % 2 == 0) ) {
  	  println(i)
  }
  
  // loop with index
  for ((num, index) <- List.zipWithIndex) {
    println(num)
    println(index)
  }
}