import java.util.stream.Collectors;
import java.util.Set;
import java.util.List;
import data.Student;
import data.StudentDatabase;

class MapStream {

  public static List<String> namesList() {
    return StudentDatabase.getAllStudents().stream()
      .map(Student::getName)
      .map(String::toUpperCase)
      .collect(Collectors.toList());
  }

  public static Set<String> namesSet() {
    return StudentDatabase.getAllStudents().stream()
      .map(Student::getName)
      .map(String::toLowerCase)
      .collect(Collectors.toSet());
  }
  public static void main(String[] args) {
    System.out.println(namesList()); 
    System.out.println(namesSet());
  }
}
