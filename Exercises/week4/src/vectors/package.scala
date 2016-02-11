/**
  * Created by ONicholls on 07/02/2016.
  */
package object vectors extends App{
import atomicscala.AtomicTest._
  /**
    * Created by ONicholls on 07/02/2016.
    */


    /*
  1. Use the REPL to create several Vectors, each populated by a dierent type of data.
  */

    val v = Vector[Int](1,2,3,4,5,6,7,8,9,10)
    println(v)

    var v1 = Vector[Double](2, 3.0, 100,101.5)
    println(v1)

    var v2 = Vector("a", "b")
    println(v2)

    var v4 = Vector(Range(0,2), Range(5,10))
    println(v4)


  // 2. Use the REPL to see if you can make a Vector containing other Vectors.

  val vector = Vector(v, v1, v2, v4)
  println(vector)


  /*3. Create a Vector and populate it with words (which are Strings). Add a for loop
  that prints each element in the Vector. Append to a variable of type String to
    create a sentence. Satisfy the following test:
    sentence.toString() is "The dog visited the fire station "
  */


  val VectorWords = Vector[String]("The", "dog", "visited", "the",  "fire station")
  var sentence: String  = ""

  for (word <- VectorWords) {
    sentence += word + " "
  }

  println(sentence)

  sentence.toString() is "The dog visited the fire station "


  /*
4. Create and initialise two Vectors, one containing Ints and one containing Doubles.
Call the sum, min, and max operations on each one.
*/

  val vectorInts = Vector[Int](1000,200,50)
  println(vectorInts)
  val vectorDoubles = Vector[Double](1.0,2,3)
  println(vectorDoubles)

  var s = vectorInts.sum
  var s1 = vectorDoubles.sum
  println(s,s1)

  var max = vectorInts.max
  var max1 = vectorDoubles.max
  println(max, max1)

  var min = vectorInts.min
  var min1 = vectorDoubles.min
  println(min, min1)

  /*5. Create two Vectors of Int named myVector1 and myVector2, each initialised to
  1, 2, 3, 4, 5, 6. Use AtomicTest to show whether the two are equivalent.*/

  val myVector1 = Vector[Int](1,2,3,4,5,6)
  val myVector2 = Vector[Int](1,2,3,4,5,6)

  myVector1 is myVector2

  val equivalent: Boolean = { // using a boolean to prove that two Vectors are equal
    myVector1 == myVector2
  }
  println(equivalent)


}
