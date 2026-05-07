import data.Student;
import data.StudentDatabase;
import java.util.List;
import java.util.stream.Collectors;

class ParallelStream2 {
  public static List<String> sequentialPrintStudentActivities() {
    long startTime = System.currentTimeMillis();
    List<String> studentActivities = StudentDatabase.getAllStudents()
      .stream()
      .map(Student::getActivities)
      .flatMap(List::stream)
      .distinct()
      .sorted()
      .collect(Collectors.toList());
    System.out.println("Sequential Time: " + (System.currentTimeMillis() - startTime));
    return studentActivities;
  }
  public static List<String> parallelPrintStudentActivities() {
    long startTime = System.currentTimeMillis();
    List<String> studentActivities = StudentDatabase.getAllStudents()
      .parallelStream()
      .map(Student::getActivities)
      .flatMap(List::stream)
      .distinct()
      .sorted()
      .collect(Collectors.toList());
    System.out.println("Parallel Time: " + (System.currentTimeMillis() - startTime));
    return studentActivities;
  }
  public static void main(String[] args) {
    System.out.println(sequentialPrintStudentActivities());
    System.out.println(parallelPrintStudentActivities());
  }
}
