package sml




class BnzInstruction(label: String, op: String, val op1: Int, goTolabel: String)
extends Instruction(label, op){
  override def execute(m: Machine) {
    println(this)
    val value1 = m.regs(op1)
    if (value1 != 0) {
      val id = m.seqId(goTolabel)
      m.execute(id,m.seqId(label) )
    }
  }

  override def toString(): String = {
    super.toString + " " + op1 + " moving execution to " + goTolabel
  }










}

object BnzInstruction {
  def apply(label: String, op1: Int, goTolabel: String) =
    new BnzInstruction(label, "bnz", op1, goTolabel)
}