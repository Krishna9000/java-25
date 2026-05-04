import data.Student;
import data.StudentDatabase;
import java.util.List;
import java.util.stream.Collectors;

class FlatMapStream {
  public static List<String> printStudentActivities() {
    List<String> studentActivities = StudentDatabase.getAllStudents().stream()
      .map(Student::getActivities)
      .flatMap(List::stream)
      .collect(Collectors.toList());
    return studentActivities; 
  }

  public static void main(String[] args) {
    System.out.println(printStudentActivities());
  }
}
