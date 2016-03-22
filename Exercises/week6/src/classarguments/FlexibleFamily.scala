package classarguments
import AtomicScala.AtomicTest._

class FlexibleFamily(mum: String, dad: String, kids:String*){

  def familySize(): Int = {
    var count = 2 // changed count to 2 because we defo know the two args mum and dad
    for(item <- kids){ // we need to iterate through kids only to count the family size
      count += 1
    }
    count
  }
}

object TestArgs1 extends App {
  val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3
}
