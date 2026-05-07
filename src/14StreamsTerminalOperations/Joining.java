import java.util.stream.Collectors;
import data.Student;
import data.StudentDatabase;

class Joining {

  public static String joiningOne() {
    return StudentDatabase.getAllStudents()
      .stream()
      .map(Student::getName)
      .collect(Collectors.joining());
  }

  public static String joiningTwo() {
    return StudentDatabase.getAllStudents()
      .stream()
      .map(Student::getName)
      .collect(Collectors.joining("-"));
  }

  public static String joiningThree() {
    return StudentDatabase.getAllStudents()
      .stream()
      .map(Student::getName)
      .collect(Collectors.joining("-", "(", ")"));
  }

  public static void main(String[] args) {
    System.out.println("JoiningOne: " + joiningOne());            
    System.out.println("JoiningTwo: " + joiningTwo());            
    System.out.println("JoiningThree: " + joiningThree());            
  }
}
