/**
  * Created by ONicholls on 12/02/2016.
  */
object Calc extends App{

  def square(num: Double): Double = {num * num}
  def cube(num: Double): Double = square(num) * num
  println(cube(3))


//object Main extends App{
//
//  val t = Calc.cube(2)
//  println(t)

}
