import data.Student;
import data.StudentDatabase;

class OptionalExample {

  public static String getStudentName() {
    Student student = StudentDatabase.studentSupplier.get();
    if (student != null) {
      return student.getName();
    } 

    return null;
  }

  public static void main(String[] args) {
    String name = getStudentName();
    System.out.println("Length of the student name: " + name.length());
  }

}
