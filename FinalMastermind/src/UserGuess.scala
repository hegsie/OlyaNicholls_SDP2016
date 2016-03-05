import scala.io.StdIn.readLine

object UserGuess {

  def sendInput() = {


    val input = readLine("Please enter a number:  ")
    println(s"your input is $input thanks ")

    input

  }

  sendInput()


}
