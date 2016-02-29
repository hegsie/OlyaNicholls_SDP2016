/**
  * Created by ONicholls on 28/02/2016.
  */
import scala.collection.mutable._

class GameGrid {

  import scala.collection.mutable

  println("Generating a secret code ....")
  var grid: List[Int] = List.range(1,13)


  def gridRows = {

    var Rows = grid.map(num => ". " *4)
    Rows
  }

  def printgrid(listofrows:List[String]) = {
    for (row <- listofrows){
      println(row)
    }
  }

  def insertGuess(index: Int, guess: String) = {
    gridRows.updated(index,guess)

  }

}


object Grid extends App{

  val g = new GameGrid
  //println(g.grid)
  println(g.gridRows)
//  val list = List[String](". . . .", ". . . .", ". . . .")
//  g.printgrid(list)
//  println()
//  //println(g.gridRows(5))
//
//  println(g.gridRows)
//
  println(g.insertGuess( 5, "ABCD"))
//




}