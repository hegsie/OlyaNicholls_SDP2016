

trait Game {

  /**
    * Run a one or more game sof mastermind, until the player
    * quits.
    */

  println("Welcome to Mastermind")

  val gr  = new Grid
  val gc = new GameCode
  val secretcode = gc.code

  var win = false



  def runGames = {

    gr.printgrid(gr.grid)
    gameflow(gr.guessCounter,win)

  }

  def gameflow(count: Int, win: Boolean ) = {

    if(win == false){
      while(count < 12){
        val guess = UserGuess.sendInput()
        gr.insertGuess(gr.guessCounter,guess)

        gr.printgrid(gr.grid)
      }
    }

  }



}

