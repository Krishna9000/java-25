import data.Student;
import data.StudentDatabase;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

class StreamsComparator {

  public static List<Student> sortStudentsByName() {
    return StudentDatabase.getAllStudents().stream()
      .sorted(Comparator.comparing(Student::getName))
      .collect(Collectors.toList());
  }
  
  public static List<Student> sortStudentsByGPA() {
    return StudentDatabase.getAllStudents().stream()
      .sorted(Comparator.comparing(Student::getGpa))
      .collect(Collectors.toList());
  }
  
  public static List<Student> sortStudentsByGPADescending() {
    return StudentDatabase.getAllStudents().stream()
      .sorted(Comparator.comparing(Student::getGpa).reversed())
      .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    System.out.println("Students sorted By Name");
    System.out.println(sortStudentsByName());
    System.out.println("Students sorted By Gpa");
    System.out.println(sortStudentsByGPA());
    System.out.println("Students sorted By Gpa descending");
    System.out.println(sortStudentsByGPADescending());
  }
}
