class Animal(val name: String, val age: Int){

  def this() = { //we have to call the primary constructor first
    this("Horse", 6) // the first lime must be this(...)
  }

}

class Animal1(val name: String, val age: Int){

  def this() = {
    //val colour:String = "Grey" - this would be illegal and
    //we will get an error message.
    // the app would say that 'this' is expected
    this("Donkey", 11)
  }

}
