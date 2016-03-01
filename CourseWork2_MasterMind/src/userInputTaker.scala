/**
  * Created by ONicholls on 29/02/2016.
  */

import scala.io.StdIn.readLine

object userInputTaker extends App{

  //var userguessesCount = 0



  def sendInput() = {
    import scala.io.StdIn.readLine

    val input = readLine("Please enter a number:  ")
    println(s"your input is $input, thanks ")

    input

  }


}

