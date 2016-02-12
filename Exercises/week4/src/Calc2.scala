/**
  * Created by ONicholls on 12/02/2016.
  */
//Here I am going to use OVERLOADING to achieve the result - the Calc would be able to work with Int and Doubles
//OVERLOADING - using the same name for different methods, as long as their arguments differ

object Calc2 extends App{

    def square(num: Double): Double = {num * num}
    def square(num: Int): Int = {num * num}

    def cube(num: Double): Double = square(num) * num
    def cube(num: Int): Int = square(num) * num

  println(cube(8.079) + "\n" + cube(100))

}
