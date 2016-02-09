package sml

/**
  * This class ....
  *
  * @author someone
  */
case class LinInstruction(label: String, opcode: String, register: Int, value: Int) extends Instruction(label, opcode) {

  override def execute(m: Machine) = {
    println(this)
    m.regs(register) = value
  }

  override def toString(): String = {
    super.toString + " register " + register + " value is " + value
  }
}

object LinInstruction {
  def apply(label: String, register: Int, value: Int) =
    new LinInstruction(label, "lin", register, value)
}