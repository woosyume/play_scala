package test

object Ex_10_2 {
  def calcBallCount(ballList: Seq[Int], inputList: Seq[Int]): BallCount = {
    var strikes = 0
    var balls = 0
    var outs = 0 
    
    for {
      (ball, indexBall) <- ballList.zipWithIndex
      (input, indexInput) <- inputList.zipWithIndex
    } {
      if ((ball, indexBall) == (input, indexInput)) strikes = strikes + 1
      else if (ball == input) balls = balls + 1
    }
    
    BallCount(strikes, balls, outs)
  }
  
  case class BallCount(strikes: Int, balls: Int, outs: Int)
}