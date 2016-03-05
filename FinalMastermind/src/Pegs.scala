/**
//  * Created by ONicholls on 05/03/2016.
//  */

import scala.collection.mutable.ListBuffer

class Pegs {

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
