//
//val myrange  = ('a' to 'z')
//myrange
//myrange(3)
//
//val num  = 3.toString
//num
//
//if (!myrange.contains(num)){
//  println("yes")
//} else {
//  println("No")
//}
//
//
//
//val numbers = 0 to 9
//
//numbers
//
//val mylist = List("yes","yes","yes","yes")
//
//mylist.length




//
//  def checkingCode(code: String, guess: String): String = {
//    import scala.collection.mutable.ListBuffer
//
//    var codeCopy = code
//    var pegInfo = new ListBuffer[String]
//
//    for (i <- Range(0, 4)) {
//      if (guess(i) == codeCopy(i)) {
//        pegInfo = pegInfo :+ "Black"
//        codeCopy = codeCopy.replace(codeCopy(i).toString, "x")
//      }
//    }
//    for (i <- Range(0, 4)) {
//      if (codeCopy.contains(guess(i))) {
//        pegInfo = pegInfo :+ "White"
//        codeCopy = codeCopy.replace(guess(i).toString, "x")
//      }
//    }
//
//    pegInfo.result().reverse.mkString(" ")
//  }




//import scala.collection.mutable.ListBuffer
//def checkingcode(code: String, guess: String): String = {
//
//  var codeCopy = code
//  var pegInfo = new ListBuffer[String]
//  val text = "Result: "
//  var index = 0
//
// while(index < 4) {
//  if (guess(index) == codeCopy(index)) {
//    pegInfo = pegInfo :+ "Black"
//    codeCopy = codeCopy.replace(codeCopy(index).toString, "x")
//    }
//  index = index + 1
// }
//
// guess.foreach(item => if(codeCopy.replaceAll("x","").contains(item)){ pegInfo = pegInfo :+ "White"})
//
// if(pegInfo.length == 0) pegInfo = pegInfo :+ "No pegs"
//
//  text + pegInfo.result().mkString(" ")
//
//
//}
//val c = "abcr"
//val g = "abcp"
//
//checkingcode(c,g)

println("Ben, it is SCALA talking to you" + '\n' + "open the enevelop" + '\n' + "THANK YOU" )

