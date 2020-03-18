package session_2

class CaseClass {

}

object CaseClassDemo extends  App {

  // case class define
  case class Employee(name: String, empId : Int, dept:String);

  var emp1=Employee("saurabh", 123, "abc");
  var emp2=Employee("Rohit", 234, "xyz");

  println(emp1==emp2);

  var emp1Copy=emp1.copy();
  var em1CopyWithChange=emp1.copy("saurabh mishra");

  //content comparision
  println(emp1==emp1Copy);
  println(emp1==em1CopyWithChange);



}
