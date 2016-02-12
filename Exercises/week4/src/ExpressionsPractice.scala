/**
  * Created by ONicholls on 12/02/2016.
  */
object ExpressionsPractice extends  App{

  //1. Write an expression that evaluates to true if the sky is sunny and the temperature is more than 80 degrees.

  val sky:String = "sunny"
  val temp:Int = 90

  val goodWeather: Boolean = sky == "sunny" && temp > 80
  println(goodWeather)

  //2. Write an expression that evaluates to true if the sky is either sunny or partly cloudy and the temperature is more than 80 degrees.

  val sky1:String = "partly cloudy"
  val temp1:Int = 100

  val goodWeather1: Boolean = sky1 == "sunny" || sky1 == "partly cloudy" && temp1 > 80
  println(goodWeather1)

  //3. Write an expression that evaluates to true if the sky is either sunny or partly cloudy
  //and the temperature is either more than 80 degrees or less than 20 degrees

  val sky2:String = "partly cloudy"
  val temp2:Int = 10

  val goodWeather2: Boolean = (sky2 == "sunny" || sky2 == "partly cloudy") && (temp2 > 80 || temp2 < 20)
  println(goodWeather2)

  //4. Convert Fahrenheit to Celsius

  val F: Double  = 100
  val C: Double = (F - 32) * (5.0/9.0)
  println(C)

 // 5. Convert Celsius to Fahrenheit.

  val C1: Double = 25
  val F1: Double = C1 * (9.0/5.0) + 32
  println(F1)

}
