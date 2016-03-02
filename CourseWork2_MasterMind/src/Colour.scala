/**
  * Created by ONicholls on 01/03/2016.
  */
//
//object GameColour {
//
//  sealed trait Colour {
//    override def toString(): String
//
//  }
//
//  case object Blue extends Colour {
//    override def toString(): String = "B"
//  }
//
//  case object Green extends Colour {
//    override def toString(): String = "G"
//  }
//
//  case object Orange extends Colour {
//    override def toString(): String = "O"
//  }
//
//  case object Purple extends Colour {
//    override def toString(): String = "P"
//  }
//
//  case object Red extends Colour {
//    override def toString(): String = "R"
//  }
//
//  case object Yellow extends Colour {
//    override def toString(): String= "Y"
//  }
//
//}

trait Blue{override def toString(): String = "B"}
trait Red{override def toString(): String = "R"}
trait Green {override def toString(): String = "G"}

object COL extends Blue with Red //with Green

