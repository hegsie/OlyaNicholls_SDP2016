package MethodsInsideClass

/**
  * Created by ONicholls on 07/02/2016.
  */
class Sailboat {

  def raise(): String  = {"Sails raised"}

  def lower(): String = {"Sails lowered"}

  def signal(): String = {new Flare().light()}

}





