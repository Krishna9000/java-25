import java.util.List;
import data.Student;
import data.StudentDatabase;
import java.util.stream.Collectors;

class FilterStreams {

  public static List<Student> filterStudents() {
    return StudentDatabase.getAllStudents().stream()
      .filter(student -> student.getGender().equals("female"))
      .collect(Collectors.toList());
  }

  public static List<Student> filterStudentsByGpa() {
    return StudentDatabase.getAllStudents().stream()
      .filter(student -> student.getGpa() >= 3.9)
      .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    filterStudents().forEach(System.out::println);
    System.out.println("----------");
    filterStudentsByGpa().forEach(System.out::println);
  }

}
