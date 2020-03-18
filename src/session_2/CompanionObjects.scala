package session_2

class CompanionObjects {

}

object HelloComp{
  //ways to define constant in a singleton object
  // akka messages
  private val message : String ="default message";

}
class HelloComp(val message: String = HelloComp.message){
  println(message)

}

class DemoCompanionClass{

  def main(args: Array[String]) : Unit={

    var tmp=new HelloComp();

  }

}
