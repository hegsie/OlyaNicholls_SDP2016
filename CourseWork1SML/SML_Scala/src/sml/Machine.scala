package sml

/**
  * The machine language interpreter
  */
case class Machine(labels: Labels, prog: Vector[Instruction]) {
  private final val NUMBEROFREGISTERS = 32
  // The registers of the SML machine
  val regs: Registers = new Registers(NUMBEROFREGISTERS)

  override def toString(): String = {
    prog.foldLeft("")(_ + _)
  }

  // Execute the program in prog, beginning at instruction 0.
  // Precondition: the program and its labels have been store properly.


  // Execute the program in prog, beginning at instruction 0.
  // Precondition: the program and its labels have been store properly.
  def execute(start: Int, end: Int) = {
    for (x <- start to end) {
      prog(x) execute this
    }
  }




  // start.until(prog.length).foreach(x => prog(x) execute this)


  def seqId(label: String): Int = {
    val filtered = prog.filter((p: Instruction) => p.getLabel()==label)
    if (filtered.length > 1)
      throw new Exception("Too many copies of the same label")
    if (filtered.length < 1)
      throw new Exception("No copies of the label found")
    prog.indexOf(filtered.last)
  }


}

object Machine extends App {
  if (args.length == 0) {
    println("Machine: args should be sml code file to execute")
  } else {
    println("SML interpreter - Scala version")

    val m = Translator(args(0)).readAndTranslate(new Machine(Labels(), Vector()))

    println("Here is the program; it has " + m.prog.size + " instructions.")
    //println(m)
    println("Beginning program execution.")
    m.execute(0, m.prog.size-1)
    println("")
    println("Ending program execution.")
    println("Values of registers at program termination:")
    println(m.regs + ".")
  }
}