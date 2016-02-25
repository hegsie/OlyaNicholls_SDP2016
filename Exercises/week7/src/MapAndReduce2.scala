/**
  * Created by ONicholls on 24/02/2016.
  */

import atomicscala.AtomicTest._

import scala.collection.immutable.VectorBuilder

object MapAndReduce2 extends App{

//Rewrite the following code:
//using a for loop instead of map, and observe the additional complexity this introduces

  val v = Vector(1, 2, 3, 4)

  var v1 = new VectorBuilder[Int]()

  for (num <- v){
    v1 +=(num + 1)
  }

  //NB: becuase of VectorBuilder, we need to use
  /*def result(): Vector[A]
  Produces a collection from the added elements. The builder's contents are undefined after this operation.
  */

  v1.result() is Vector(2, 3, 4, 5)

/*
Rewrite the following code:
using for loops.

 */

  val v2 = Vector(1, 10, 100, 1000)
  v2.reduce((sum, n) => sum + n) is 1111

 var  sum = 0
  for (num <- v2){
    sum += num
  }

  sum is 1111

/*
. Use reduce to implement a method sumIt that takes a variable argument list and
sums those arguments.
 */

  def sumIt(num: Int*): Int = {

    num.reduce((sum, n) => sum + n)
  }

  sumIt(1,2,3) is 6
  sumIt(45, 45, 45, 60) is 195








}
