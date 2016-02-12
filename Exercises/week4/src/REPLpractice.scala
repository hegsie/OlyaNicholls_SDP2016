/**
  * Created by ONicholls on 12/02/2016.
  */
object REPLpractice extends App{

  val num: Int = 17
  println(num)

  //num = 20 - is not legal, because val are constants and cannot be reassigned!

 /* Error:(9, 7) reassignment to val
  num = 20*/


  val str: String = "ABC1234"
  println(str)

  //str = "DEF1234" - is not legal, because val are constants and cannot be reassigned!

  /*Error:(18, 7) reassignment to val
  str = "DEF1234"*/

  val decimal: Double = 15.56
  println(decimal)


}
