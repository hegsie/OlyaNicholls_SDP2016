package nameddefaultarguments
import AtomicScala.AtomicTest1._
/**
  * Created by ONicholls on 12/02/2016.
  */
class Item(val name: String, val price: Double) {

  def cost(grocery: Boolean = false, medication: Boolean = false, taxRate:Double = 0.10): Double = {
    var totalCost:Double = 0.00
    if(grocery || medication){
      totalCost += price
    } else {
      totalCost = price + price*taxRate
    }
    totalCost
  }
}

object MyItem extends App{

  val icecream = new Item(name = "ice cream", 10)
  icecream.cost()

  val flour = new Item(name="flour", 4)
  flour.cost(grocery=true) is 4

  val sunscreen = new Item(
    name="sunscreen", 3)
  sunscreen.cost() is 3.3

  val tv = new Item(name="television", 500)
  tv.cost(taxRate = 0.06) is 530



}

