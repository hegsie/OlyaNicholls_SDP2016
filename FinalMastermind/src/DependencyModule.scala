import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule

/**
  * Created by ONicholls on 16/03/2016.
  */
class DependencyModule extends AbstractModule with ScalaModule{

  def configure: Unit ={
    bind[Colour].to

  }
}
