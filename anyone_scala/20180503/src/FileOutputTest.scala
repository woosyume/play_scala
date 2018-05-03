import java.io.PrintWriter
import java.io.File
import scala.io.StdIn.readLine


object FileOutputTest {
  def main(args: Array[String]): Unit = {
    val fileName = "test.txt"
    var input = readLine("sample contents")
    
    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close()
        
  }
}