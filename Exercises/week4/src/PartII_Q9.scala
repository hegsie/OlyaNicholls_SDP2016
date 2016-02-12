/**
  * Created by ONicholls on 12/02/2016.
  */
object PartII_Q9 extends App{

  object argh {
    def a = {
      println("a")
      1
    }
    val b = { // note this is a value!
      println("b")
      a + 2
    }
    def c = {
      println("c")
      a
      b + "c"
    }
  }
  argh.c


}
