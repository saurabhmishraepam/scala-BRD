package session_1

class ClassAndObjects {
  def meth1(str: String):String ={
    println("input value "+str);

    var t:String ="my string content";
    var t1="my string content";


    val s="abc";
    val s1=s"$s is done";
    val s2=s"${s*3} is done";
    println(s2);

    return "This is the return value";
  }
}

object App{

  def main(args : Array[String]) : Unit={
    val v=new ClassAndObjects();
    //v=new session_1.ClassAndObjects();
    v.meth1("this is ");
    print("this is done")
  }

}
