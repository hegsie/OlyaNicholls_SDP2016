/**
//  * Created by ONicholls on 05/03/2016.
//  */



/**
//  * Created by ONicholls on 05/03/2016.
//  */

import scala.collection.mutable.ListBuffer

trait Pegs {

  def checkingCode(code: String, guess: String): String = {

    var codeCopy = code
    var pegInfo = new ListBuffer[String]

    for (i <- Range(0, 4)) {
      if (guess(i) == codeCopy(i)) {
        pegInfo = pegInfo :+ "Black"
        codeCopy = codeCopy.replace(codeCopy(i).toString, "x")
      }
    }
    for (i <- Range(0, 4)) {
      if (codeCopy.contains(guess(i))) {
        pegInfo = pegInfo :+ "White"
        codeCopy = codeCopy.replace(guess(i).toString, "x")
      }
    }

    pegInfo.result().reverse.mkString(" ")
  }
}






//import scala.collection.mutable.ListBuffer
//
//trait Pegs {
//
//  def checkingCode(code: String, guess: String): String = {
//
//    var pegInfo = new ListBuffer[String]
//    for (item <- guess) {
//      if (code.contains(item)) {
//        if (code.indexOf(item) == guess.indexOf(item)) {
//          pegInfo = pegInfo :+ "Black"
//        } else {
//          pegInfo = pegInfo :+ "White"
//        }
//      }
//    }
//
//    pegInfo.result().mkString(" ")    // instead of toString
//
//
//  }
//
//}
//




//import scala.collection.mutable.ListBuffer
//
//trait Pegs {
//
//  def checkingCode(code: String, guess: String): String = {
//
//    var pegInfo = new ListBuffer[String]
//    for (item <- guess) {
//      if (code.contains(item)) {
//        if (code.indexOf(item) == guess.indexOf(item)) {
//          pegInfo = pegInfo :+ "Black"
//        } else {
//          pegInfo = pegInfo :+ "White"
//        }
//      }
//    }
//
//    (pegInfo.result()).mkString(", ")    // instead of toString
//
//
//  }
//
//
//}
