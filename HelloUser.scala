import scala.io.StdIn._

object HelloUser {
  def main(args: Array[String]): Unit = {
    println("What's your name?")
    val name = readLine()
    println("Hello, " + name + "!")
  }
}
