
/**
  * Created by ONicholls on 05/03/2016.
  */


class Grid extends GameCode with Pegs{

  val secretCode = code
  var grid: List[String] = List.range(1,13).map(num => "." *4)  // TAKE OUT THE SPACE
  var guessCounter: Int = 0
  var lastPegs: String = ""
  var codeString = "...."



  def printgrid(listofrows:List[String]) = {
    println(codeString + " Secret Code")
    for (row <- listofrows){
      if(row.equals("....")) {
        println(row)
      } else {
        val check = checkingCode(secretCode,row)
        lastPegs = check
        if (check.length() > 0) {
          println(row + " result: " + check)
        } else {
          println(row + " result: No Pegs")
        }
      }
    }
  }

  def insertGuess(index: Int, guess: String) = {
    grid = grid.updated(index,guess)
    updateCount()
  }

  def updateCount() = {
    guessCounter += 1
  }
}

object Grid extends App {
  def apply = new Grid
}






























//class Grid extends GameCode with Pegs{
//
//  val secretCode = code
//  var grid: List[String] = List.range(1,13).map(num => "." *4)  // TAKE OUT THE SPACE
//  var guessCounter: Int = 0
//  var lastPegs: String = ""
//  var codeString = "...."
//
//  //
//  //
//  //  def gridRows = {
//  //
//  //    val Rows = grid.map(num => ". " *4)
//  //    Rows
//  //  }
//
//  def printgrid(listofrows:List[String]) = {
//    println(codeString + " Secret Code")
//    for (row <- listofrows){
//      if(row.equals("....")) {
//        println(row)
//      } else {
//        val check = checkingCode(secretCode,row)
//        lastPegs = check
//        if (check.length() > 0) {
//          println(row + " result: " + check)
//        } else {
//          println(row + " result: No Pegs")
//        }
//      }
//    }
//  }
//
//  def insertGuess(index: Int, guess: String) = {
//    grid = grid.updated(index,guess)
//    updateCount()
//  }
//
//  def updateCount() = {
//    guessCounter += 1
//  }
//}
//
//object Grid extends App {
//  def apply = new Grid
//}







///**
//  * Created by ONicholls on 05/03/2016.
//  */
//class Grid extends GameCode with Pegs{
//
//
//  val secretcode = code
//  var grid: List[String] = List.range(1,13).map(num => "." *4)
//  var guessCounter: Int = 0
//  var lastPegs: String = ""
//
//
////
////
////  def gridRows = {
////
////    val Rows = grid.map(num => ". " *4)
////    Rows
////  }
//
//  def printgrid(listofrows:List[String]) = {
//    println(code + "Secret Code") ///?????????? WHY
//    for (row <- listofrows){
//      if(row.equals("....")) {
//        println(row)
//      } else {
//        val check  = checkingCode(secretcode,row)
//        lastPegs = check
//        if (check.length() > 0) {
//          println(row + " result: " + check)
//        } else {
//          println(row + " result: No Pegs")
//        }
//      }
//
//    }
//  }
//
//  def insertGuess(index: Int, guess: String) = {
//    grid = grid.updated(index,guess)
//    updateCount()
//  }
//
//  def updateCount() = {
//    guessCounter += 1
//  }
//
//}
//
//
//object Grid extends App {
//  def apply = new Grid
//}
//

//object Grid extends App{
//
//  def apply  = new GameGrid
//  val g = new GameGrid
//  var UpdateGrid = g.gridRows
//
//  g.printgrid(UpdateGrid)
//  val userI = userInputTaker
//
//
//  UpdateGrid = g.insertGuess(this.UpdateGrid, g.guessCounter, userI.sendInput())
//  g.updateCount()
//  g.printgrid(UpdateGrid)
//  UpdateGrid = g.insertGuess(this.UpdateGrid,g.guessCounter, userI.sendInput())
//  g.printgrid(UpdateGrid)
//



