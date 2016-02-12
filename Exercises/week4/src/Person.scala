/**
  * Created by ONicholls on 12/02/2016.
  */
class Person (val firstname: String,val lastName: String ) {

  val f = firstname
  val l = lastName
}

class Alien {

  def greet(greetingWho:Person): Unit = {
    println("Hi " + greetingWho.firstname)
  }

  def greet(greetingWho: String): Unit = {
    println("Hi " + greetingWho)
  }


}
object MyMain extends App{

  val p = new Person("Olya","Nicholls")
  val a = new Alien

  a.greet(p)
  a.greet("Maria")



}
