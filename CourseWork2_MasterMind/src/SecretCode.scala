/**
  * Created by ONicholls on 26/02/2016.
  */


import scala.collection.mutable.ListBuffer

class SecretCode {


  var colours = List[String]("B", "G", "Y", "O", "P", "R")
  var code = new ListBuffer[String]

  def generateCode() = {
    for (i <- Range(0,4)){
      import scala.util.Random

      code = code :+ colours(Random.nextInt(5))
    }
    println(code)


    }

}

object Test extends App{

  val sc = new SecretCode
  sc.generateCode()


}
