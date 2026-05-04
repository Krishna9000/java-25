import java.util.List;
import java.util.stream.Collectors;
import data.Student;
import data.StudentDatabase;

class DistinctCountSorted {

  public static List<String> printStudentActivities() {
    List<String> studentActivities = StudentDatabase.getAllStudents().stream()
      .map(Student::getActivities)
      .flatMap(List::stream)
      .distinct()
      .collect(Collectors.toList());
    return studentActivities; 
  }

  public static long getStudentActivitiesCount() {
    long studentActivities = StudentDatabase.getAllStudents().stream()
      .map(Student::getActivities)
      .flatMap(List::stream)
      .distinct()
      .count();
    return studentActivities; 
  }

  public static List<String> printStudentActivitiesSorted() {
    List<String> studentActivities = StudentDatabase.getAllStudents().stream()
      .map(Student::getActivities)
      .flatMap(List::stream)
      .distinct()
      .sorted()
      .collect(Collectors.toList());
    return studentActivities; 
  }

  public static void main(String[] args) {
    System.out.println(printStudentActivities());
    System.out.println(getStudentActivitiesCount());
    System.out.println(printStudentActivitiesSorted());
  }
}
