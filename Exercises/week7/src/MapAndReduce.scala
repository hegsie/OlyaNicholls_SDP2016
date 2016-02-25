import atomicscala.AtomicTest._


object MapAndReduce extends App{

  val v = Vector(1, 2, 3, 4)
  v.map(n => n*11+10) is Vector(21,32,43,54)


  //(b) Can you replace map with foreach in the above solution? What happens? Test the result.

  val v1 = Vector(1, 2, 3, 4)
 // val newV = v1.foreach(n => n*11+10) is Vector(21,32,43,54) // -> does not work, Scala throws an error

  /*
  (c) Rewrite the solution for the previous exercise part using for. Was this more
or less complex than using map? Which approach has the greater potential for
errors?
   */

  import scala.collection.mutable.ListBuffer

  val v2 = Vector(1, 2, 3, 4)


  var myVector = ListBuffer[Int]()

 //var myVector = new VectorBuilder[Int]()
  for (num <- v2) {
    myVector += (num*11+10)}

  val finalV = myVector.toList.toVector

  finalV is Vector(21, 32, 43, 54)


}


