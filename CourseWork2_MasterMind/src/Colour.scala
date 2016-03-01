/**
  * Created by ONicholls on 01/03/2016.
  */


sealed trait Colour{
  def colname: String

}
case object Blue extends Colour{
  def colname: String = "B"
}

case object Green extends Colour{
  def colname: String = "G"
}
case object Orange extends Colour{
  def colname: String = "O"
}

case object Purple extends Colour{
  def colname: String = "P"
}
case object Red extends Colour{
  def colname: String = "R"
}

case object Yellow extends Colour{
  def colname: String = "Y"
}

