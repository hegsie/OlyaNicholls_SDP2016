package nameddefaultarguments
import AtomicScala.AtomicTest._
/**
  * Created by ONicholls on 12/02/2016.
  */
class Planet2 (val moons: Int, name: String, description: String){
  def hasMoon(): Boolean = if (moons > 0) true
  else false

}

object Planet2 extends App{
  val earth = new Planet2(moons = 1, name = "Earth",
    description = "a hospitable planet")
  earth.hasMoon is true
}

