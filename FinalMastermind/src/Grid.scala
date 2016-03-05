/**
  * Created by ONicholls on 05/03/2016.
  */
class Grid {


  var grid: List[String] = List.range(1,13).map(num => ". " *4)
  var guessCounter: Int = 0

//
//
//  def gridRows = {
//
//    val Rows = grid.map(num => ". " *4)
//    Rows
//  }

  def printgrid(listofrows:List[String]) = {
    for (row <- listofrows){
      println(row)
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



