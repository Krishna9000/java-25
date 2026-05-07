import data.Student;
import data.StudentDatabase;
import java.util.stream.Collectors;
 
class Counting {

  public static long count() {
    return StudentDatabase.getAllStudents()
      .stream()
      .filter(student -> student.getGpa() >= 3.9)
      .collect(Collectors.counting());
  }

  public static void main(String[] args) {
    System.out.println("Count: " + count());
  }
}
