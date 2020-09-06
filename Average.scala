import scala.io.StdIn._

object Average {
    def main(args: Array[String]): Unit = {
        println("Enter space-separated numbers:")
        val numbers: Array[Double] = readLine().trim.split(" +").map(_.toDouble)
        val average: Double = numbers.sum / numbers.length
        println(f"Average: ${average}%.2f")
    }
}