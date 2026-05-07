import data.StudentDatabase;
import data.Student;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Mapping {
  public static void main(String[] args) {

    List<String> studentNames = StudentDatabase.getAllStudents().stream()
      .collect(Collectors.mapping(student -> student.getName(), Collectors.toList()));
    System.out.println(studentNames);

    Set<String> studentNamesSet = StudentDatabase.getAllStudents().stream()
      .collect(Collectors.mapping(student -> student.getName(), Collectors.toSet()));
    System.out.println(studentNamesSet);

  }
}
