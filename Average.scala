import scala.io.StdIn._

object Average {
    def main(args: Array[String]): Unit = {
        print("Enter space-separated numbers: ")
        val numbers: Array[Double] = readLine().trim.split(" +").map(_.toDoubleOption).flatten
        val average: Double = numbers.sum / numbers.length
        println(f"Average: ${average}%.2f")
    }
}