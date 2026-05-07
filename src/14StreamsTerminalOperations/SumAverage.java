import data.Student;
import data.StudentDatabase;
import java.util.stream.Collectors;

class SumAverage {

  public static int summation() {
    return StudentDatabase.getAllStudents().stream()
      .collect(Collectors.summingInt(Student::getNoOfNotebooks));
  }

  public static double averaging() {
    return StudentDatabase.getAllStudents().stream()
      .collect(Collectors.averagingInt(Student::getNoOfNotebooks));
  }

  public static void main(String[] args) {
    System.out.println("Summation of all notebooks from all students: " + summation());
    System.out.println("Average of all notebooks from all students: " + averaging());
  }

}
