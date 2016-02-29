/**
  * Created by ONicholls on 26/02/2016.
  */


import scala.collection.mutable.ListBuffer

class SecretCode {


  var colours = List[String]("B", "G", "Y", "O", "P", "R")
  var code = new ListBuffer[String]

  val guess1 = List[String]("Y", "O", "P", "R")
  val guess2 = List[String]("G", "P", "P", "B")
  val guess3 = List[String]("O", "Y", "R", "G")
  val guess4 = List[String]("G", "B", "O", "Y")



  def generateCode: List[String] = { //do we want it to return a string?
    for (i <- Range(0,4)){
      import scala.util.Random

      code = code :+ colours(Random.nextInt(5))

    }
    val finalcode = code.result()
    println(finalcode) //need to remove afterwards
    finalcode


    }


  def checkingCode(code: List[String], guess: List[String]): String = {
    var pegInfo = new ListBuffer[String]
    for (item <- guess) {
      if (code.contains(item)) {
        if (code.indexOf(item) == guess.indexOf(item)) {
          pegInfo = pegInfo :+ "Black"
        } else {
          pegInfo = pegInfo :+ "White"
        }
      }
    }

    (pegInfo.result()).mkString(", ")    // instead of toString


  }
}

object Test extends App{

  val sc = new SecretCode
  val z = sc.generateCode



  val guess5 = List[String]("Y", "O", "P", "R")

  println(sc.checkingCode(z, guess5))




}
