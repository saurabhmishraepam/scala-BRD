package session_2

class FunctionAndMethods {

  // this is a method
  def method1(): Unit={
    println("Method1 invoked ");
  }
  // this is a function def it is internally an object of type <function23>
  var fun= (v: Int) =>{
    println("invoking value "+ v)
    2000
  }: Int

  var procedure ={
    println("list of statments clubed together")
  }:Unit
}

object functionAndMethDiff {
  def main(args: Array[String]): Unit = {

    var funAndMethDifferenceObj = new FunctionAndMethods
    var holder: Int = funAndMethDifferenceObj.fun(2)
    println(holder)
    println(funAndMethDifferenceObj.method1())

  }
}