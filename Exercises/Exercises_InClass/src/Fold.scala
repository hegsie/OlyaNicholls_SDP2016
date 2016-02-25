/**
  * Created by ONicholls on 18/02/2016.
  */
object Fold extends App{

  val numbers = List(1,5,10)
  val t = numbers.foldRight(0) { (z, i) => i - z}
  val t1 = numbers.foldRight(0) {_-_}


  println("foldRight with parameters flipped: "+t)
  println("foldRight with syntactical sugar ... i.e. without parameters flipped: "+t1)


}
