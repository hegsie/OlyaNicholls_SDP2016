/**
  * Created by ONicholls on 07/02/2016.
  */
package object MethodsInsideClass extends App{

  val sailboat = new Sailboat
  val r1 = sailboat.raise()
  assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
  println(r1)

  val r2 = sailboat.lower()
  assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
  println(r2)


  val motorboat = new Motorboat
  val s1 = motorboat.start()
  assert(s1 == "Motor ON", "Expected Motor ON, Got " + s1)
  println(s1)


  val s2 = motorboat.stop()
  assert(s2 == "Motor OFF", "Expected Motor OFF, Got " + s2)
  println(s2)

  val flare = new Flare
  val f1 = flare.light
  assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
  println(f1)

  val sailboat2 = new Sailboat
  val signal = sailboat2.signal()
  assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
  println(signal)


  val motorboat2 = new Motorboat
  val flare2 = motorboat2.signal()
  assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
  println(flare2)
}
