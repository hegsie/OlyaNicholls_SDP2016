package auxiliaryconstructors

/**
  * Created by ONicholls on 13/02/2016.
  */
class ClothesWasher (val modelName: String, val capacity: Double){

  def this (modelName: String) = {
    this(modelName,5)
  }

  def this(capacity: Double) = {
    this("SuperWahser", capacity)

  }

}


