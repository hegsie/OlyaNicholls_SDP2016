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



