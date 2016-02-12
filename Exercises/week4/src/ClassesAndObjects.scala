/**
  * Created by ONicholls on 12/02/2016.
  */
object ClassesAndObjects extends App{

  val R: Range = Range(0,10)
  println(R)

  val R1: Range = Range(0, 10, 2) // prints even numbers only
  println(R1)

  var s1: String = "Sally"
  var s2: String = "Sally"
  val StringsEqual: Unit ={
    if (s1.equals(s2))
      println("s1 and s2 are equal")
    else
      println("s1 and s2 are NOT equal")}




}


