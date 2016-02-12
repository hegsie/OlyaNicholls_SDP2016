/**
  * Created by ONicholls on 12/02/2016.
  */
object CreatingClasses extends  App{

  class Hippo
  class Lion
  class Tiger
  class Monkey
  class Giraffe

  val h: Hippo = new Hippo
  val l:Lion = new Lion
  val t: Tiger = new Tiger
  val m:Monkey = new Monkey
  val g: Giraffe = new Giraffe

  println(h + "\n" + l + "\n" + t + "\n" + m + "\n" + g)

  val l1: Lion = new Lion
  val g1: Giraffe = new Giraffe
  val g2: Giraffe = new Giraffe

  println("\n" + l1 + "\n" + g1 + "\n" + g2 )
}
