

trait Game {

  /**
    * Run a one or more game sof mastermind, until the player
    * quits.
    */

  println("Welcome to Mastermind")

  var gr  = new Grid

  val secretcode = GameCode
  var win = false

  def runGames = {

    gr.printgrid(gr.grid)
    gameflow(gr.guessCounter,win)

  }

  def gameflow(count: Int, win: Boolean ) = {

    if(win == false){
      while(count < 12){
        gr.insertGuess(gr.grid, gr.guessCounter,UserGuess.sendInput())
        gr.printgrid(gr.grid)
      }
    }

  }



}

