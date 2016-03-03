import AtomicScala.AtomicTest._

/**
  * Created by ONicholls on 17/02/2016.
  */
object ParametarisedTypes extends App{

  // Return type is inferred:
  def inferred(c1: Char, c2: Char, c3: Char) = {
    Vector(c1, c2, c3)
  }
  // Explicit return type:
  def explicit(c1: Char, c2: Char, c3: Char):
  Vector[Char] = {
    Vector(c1, c2, c3)
  }
//  inferred('a', 'b', 'c') is "Vector(a, b, c)"
//  explicit('a', 'b', 'c') is "Vector(a, b, c)"

  def explicitDouble(c1: Double, c2: Double, c3: Double):
  Vector[Double] = {
    Vector(c1, c2, c3)
  }

  explicitDouble(1.0, 2.0, 3.0) is Vector(1.0, 2.0, 3.0)

  // alter explicit to take a Vector and create and return a List.

  def explicitList(v1: Vector[Double]): List[Double] = {

    //Need to convert our Vector to List --> def toList: scala.List[A] Converts this traversable or iterator to a list.
    v1.toList
  }

  explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
  explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)


  //change explicit to return a Set.


  def explicitSet(v1: Vector[Double]): Set[Double] = {

    //Need to convert our Vector to List --> def toList: scala.List[A] Converts this traversable or iterator to a list.
    v1.toSet
  }

  explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
  explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)


}
