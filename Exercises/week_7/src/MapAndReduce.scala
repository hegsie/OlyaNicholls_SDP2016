import atomicscala.AtomicTest._


object MapAndReduce extends App{

  val v = Vector(1, 2, 3, 4)
  v.map(n => n*11+10) is Vector(21,32,43,54)

  val v1 = Vector(1, 2, 3, 4)
  val newV = v1.foreach(n => n*11+10) is Vector(21,32,43,54)

  newV is Vector(21,32,43,54)



}


//val v = Vector(1, 10 , 100, 1000)
//5 var sum = 0
//6 v.foreach(x => sum += x)