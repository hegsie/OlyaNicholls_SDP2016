import scala.io.StdIn.readLine
import scala.collection.mutable.ListBuffer

object UserGuess {

  def sendInput(): ListBuffer[Colour] = {

    println()
    println("Please enter your guess to crack the secret code")
    println()

    var input = " "

    var input_correct = false

    while (!input_correct) {

      val takeinput = readLine("Your guess is: ").toUpperCase()

      if (takeinput.length > 4 || takeinput.length < 4) {
        println(s"Your guess code should be 4 characters, BUT YOURS IS ${takeinput.length}. Try again")
        println()
      } else {

        val pass = new ListBuffer[String]
        takeinput.foreach(ch => if ((List('R','B','Y','O','P','G')).contains(ch)) {
          pass += "yes"
        })
        if (pass.result().length == 4) {
          input = takeinput
          input_correct = true
        } else {
          println("Every single character of your code must be a bla. Try again")
          println()
        }

      }

    }

    var output = new ListBuffer[Colour]

    for (i <- Range(0,4)) {
      input(i) match {

        case 'R' => output = output += new Colour("Red")
        case 'B' => output = output += new Colour("Blue")
        case 'Y' => output = output += new Colour("Yellow")
        case 'O' => output = output += new Colour("Orange")
        case 'P' => output = output += new Colour("Purple")
        case 'G' => output = output += new Colour("Green")
        case _ => output = output += null
      }

    }
    output
  }
}

object testguess extends App{

  UserGuess.sendInput

}

//var wronginput = false
//input.foreach(ch => ch match {
//  case str if ('A' to 'Z').contains(ch) => input_correct = true
//  case notstr if !('A' to 'Z').contains(ch) => val wronginput = true }
//)
//if(wronginput){println("you need to enter letters, not numbers or symbols")}
//}
//
//}
//input
