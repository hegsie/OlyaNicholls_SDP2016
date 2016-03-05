/**
  * Created by ONicholls on 05/03/2016.
  */
class Colour (name: String) {

    override def toString() : String = name.split("").headOption.mkString.toUpperCase
}

object Colour {

  def apply(name:String) = new Colour(name)

}
