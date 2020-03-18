package session_2

class PureFunction {

  def promoteImpureFunction(student: StudentDto):Unit={
    //update of student properties
    student.standard=student.standard + 1;
  }

  def promotePureFunction(student: StudentDto):StudentDto={
    //f(x)=y always
    val studentDto=student.copy();
    studentDto.standard=studentDto.standard + 1;
    return studentDto;
  }



  //journal technique for db persistent



}




case class StudentDto(var name:String, var rollNumber: BigInt, var standard: Int){

}
