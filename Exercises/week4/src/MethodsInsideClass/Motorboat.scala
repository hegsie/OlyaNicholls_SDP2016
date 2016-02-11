package MethodsInsideClass

/**
  * Created by ONicholls on 07/02/2016.
  */
class Motorboat {

  def start(): String = {"Motor ON"}

  def stop(): String = {"Motor OFF"}

  def signal(): String = {new Flare().light()}

}