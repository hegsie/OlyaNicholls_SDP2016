/**
  * Created by ONicholls on 12/02/2016.
  */
object Methods extends App{

  //1. Create a method getSquare that takes an Int argument and returns its square

  def getSquare(num: Int): Int = { num * num}

  val a = getSquare(3)
  println(a)
  assert(a == 9, "Expected 9, outcome " + a )


  val b = getSquare(6)
  println(b)
  assert(b == 36, "Expected 36, outcome " + b )


  val c = getSquare(5)
  println(c)
  assert(c == 25, "Expected 9, outcome " + c )

  //2. Create a method isArg1GreaterThanArg2 that takes two Double arguments. Return
  //true if the first argument is greater than the second. Return false otherwise

  def isArg1GreaterThanArg2(num1: Double, num2: Double): Boolean = {num1 > num2}

  val t1 = isArg1GreaterThanArg2(4.1, 4.12)
  println(t1)
  assert(t1 == false, "Expected FALSE, outcome " + t1)

  val t2 = isArg1GreaterThanArg2(2.1, 1.2)
  println(t2)
  assert(t2 == true, "Expected TRUE, outcome " + t2)


  //3. Create a method manyTimesString that takes a String and an Int as arguments
  //and returns the String duplicated that many times

  def manyTimesString(str: String, num: Int): String  = {str*num}

  val m1 = manyTimesString("abc", 3)
  assert("abcabcabc" == m1, "Expected 'abcabcabc', outcome " + m1)
  println(m1)

  val m2 = manyTimesString("123", 2)
  assert("123123" == m2, "Expected '123123', outcome " + m2)
  println(m2)


}
