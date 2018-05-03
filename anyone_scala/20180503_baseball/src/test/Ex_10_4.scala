package test
import scala.io.StdIn.readLine
import scala.util.Random

import test.Ex_10_1.convertInputs
import test.Ex_10_3.calcBallCountSeq
import test.Ex_10_3.BallCount

object Ex_10_4 {
  def main(args: Array[String]): Unit = {
    println("Start baseball game!")
    val ballList = Random.shuffle(0 to 9).drop(7)
    
    while (true) {
      println("Please insert a number(000 ~ 999).")
      val inputList = convertInputs(readLine)
      
      println("what? " + inputList)
      if (inputList != None) {
        val ballCount = calcBallCountSeq(ballList, inputList.get)
        
        ballCount match {
          case BallCount(0, 0, 0) => 
            println("out!")
          case BallCount(3, 0, 0) =>
            println("3 strikes! You win")
            System.exit(0)
          case BallCount(strike, 0, 0) =>
            println(s"$strike strike!")
          case BallCount(0, ball, 0) =>
            println(s"$ball ball")
          case BallCount(strike, ball, 0) =>
            println(s"$strike strike and $ball ball!")
        }
        
      } else {
        println("Please insert correct values.")
      }
      
    }
  }
}