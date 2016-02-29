import scala.collection.mutable.ListBuffer
import scala.util.Random

val x  = Range(0,4)

val y = Random.nextInt(100)

y
y
y
y
y

val l  = List("A", "B", "C")

val t = List("A", "Z", "C")

for (i <- t) {
  if (l.contains(i)) {
    if (t.indexOf(i) == l.indexOf(i)) {
      println("black")
    } else {
      println("white")
    }
  }

}

val z = Vector[Int](1,2,3)

val p = Vector[String](". " * 4)
val a = z(2)


val m = List[String]("A", "B", "Z")
m.length
m.toString()
m.mkString(", ")

import scala.collection.mutable.ArrayBuffer

def grid() = {
  var gamefield = ArrayBuffer[Vector[String]]()
  for (i <- Range(0,12)) {
    gamefield :+ Vector[String](". " * 4)
  }
  gamefield.result()

}


val v = Vector(1, 2, 3, 4)
val ar = v.map(n => List("."*4).mkString(""))

for(i <-ar){println(i, "\n")}



//////////////////////////////////////////



import scala.io.StdIn.readLine

object userInputTaker {

  val input = readLine("Please enter your guess :  ")

  println(s"your input is $input, thanks ")

}

val user = userInputTaker




