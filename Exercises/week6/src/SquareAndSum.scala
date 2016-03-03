/**
  * Created by ONicholls on 12/02/2016.
  */
import AtomicScala.AtomicTest._

object SquareAndSum extends App {

  def squareThem(num: Int*):Int  = {
    var sum  = 0
    for(i <- num){

      sum += i*i
     }
    sum

  }
  squareThem(2) is 4
  squareThem(2, 4) is 20
  squareThem(1, 2, 4) is 21

}


