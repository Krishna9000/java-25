import data.Student;
import data.StudentDatabase;
import java.util.function.Consumer;

class ConsumerMethodReferenceExample {
  static Consumer<Student> student = System.out::println;
  public static void main(String[] args) {
    StudentDatabase.getAllStudents().forEach(student);
  }
}
