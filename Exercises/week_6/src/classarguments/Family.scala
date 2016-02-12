package classarguments

import AtomicScala.AtomicTest1._

/**
  * Created by ONicholls on 12/02/2016.
  */
class Family(famMember:String*){

def familySize(): Int = {
var count = 0
for(item <- famMember){
count += 1
}
count
}
}

object TestArgs extends App {
  val family1 = new Family("Mom", "Dad", "Sally", "Dick")
  family1.familySize() is 4
  val family2 = new Family("Dad", "Mom", "Harry")
  family2.familySize() is 3
}
