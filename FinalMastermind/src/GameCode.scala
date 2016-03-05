
import scala.collection.mutable.ListBuffer
import scala.util.Random


class GameCode {

  val ourcolours = GameColours.gcol
  var code = new ListBuffer[Colour]


  def generateCode: List[Colour] = { //do we want it to return a string?
    for (i <- Range(0,4)){

      code = code :+ ourcolours(Random.nextInt(5))
    }
    val finalcode = code.result()
    //println(finalcode) //need to remove afterwards
    finalcode

  }

}

  object dvjfvbj extends App{

    val sc = new GameCode
    val sctest = sc.generateCode

    println(sctest)

}
