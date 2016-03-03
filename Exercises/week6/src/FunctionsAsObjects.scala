import AtomicScala.AtomicTest._
/**
  * Created by ONicholls on 17/02/2016.
  */
object FunctionsAsObjects extends App{

  //Working from your solution to the exercise above, add a comma between each number.

  def explicitVector(v1: Vector[Int]): Vector[Int] = {
    v1
  }
  var str = ""
  val numbers = explicitVector(Vector(1, 2, 3, 4))
  numbers.foreach(n => str = str + n + ",")
  str is "1,2,3,4,"

  // . Create an anonymous function that calculates age in dog years (by multiplying years by 7).

val dogYears = (y:Int) => y*7
  dogYears(10) is 70


  //. Create a Vector and append the result of dogYears to a String for each value in the Vector

  var s = ""
  val v = Vector(1, 5, 7, 8)
  v.foreach(y => s = s + dogYears(y) + " ")
  s is "7 35 49 56 "


  //Create an anonymous function to square a list of numbers. Call the function for every
  //element in a Vector, using foreach.



  var s1 = ""
  val numbers1 = Vector(1, 2, 5, 3, 7)
  numbers1.foreach(num => s1 = s1 + num*num + " ")
  s1 is "1 4 25 9 49 "



}

