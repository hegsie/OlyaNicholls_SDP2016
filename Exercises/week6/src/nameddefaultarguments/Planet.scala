package nameddefaultarguments

import AtomicScala.AtomicTest._

/**
  * Created by ONicholls on 12/02/2016.
  */
class Planet (val name: String, description: String, val moons:Int = 0){
  def hasMoon(): Boolean = {
    if (moons > 0) true
    else false
  }
}

object MyPlanets extends App{

  val p = new Planet(name = "Mercury",
    description = "small and hot planet", moons = 0)
  p.hasMoon is false

}
