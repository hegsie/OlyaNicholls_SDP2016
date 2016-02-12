package sml

import org.scalatest.FunSuite

/**
  * Created by ONicholls on 11/02/2016.
  */
class AddInstructionTest extends FunSuite {

  test("testToString") {
    val AddInstruction = new AddInstruction("L1", "add", 2, 1, 1)

    assert(AddInstruction.toString() == "L1: add " + 1.toString + " + " + 1.toString + " to " + 2.toString)

  }

  test("testApply") {
    assert(true)
  }

}
