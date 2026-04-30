import java.util.function.Consumer;
import java.util.List;
import data.StudentDatabase;
import data.Student;

class ConsumerInterface {

  static Consumer<Student> student = studentDetails -> System.out.println(studentDetails);
  static Consumer<Student> studentNames = studentDetails -> System.out.print(studentDetails.getName());
  static Consumer<Student> studentActivities = studentDetails -> System.out.println(studentDetails.getActivities());

  public static List<Student> getAllStudents() {
    return StudentDatabase.getAllStudents();
  }

  public static void printName() {
    List<Student> studentList = getAllStudents();
    studentList.forEach(student);
  }

  public static void printNameAndActivities() {
    List<Student> studentList = getAllStudents();
    studentList.forEach(studentNames.andThen(studentActivities));
  }

  public static void printNameAndActivitiesUsingCondition() {
    List<Student> studentList = getAllStudents();

    studentList.forEach(student -> {
      if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
        studentNames.andThen(studentActivities).accept(student);
      }
    });
  }

  public static void main() {
    Consumer<String> consumerString = string -> System.out.println(string.toUpperCase());
    System.out.println("To uppercase");
    consumerString.accept("Rama");
    System.out.println("Print All Names");
    printName();
    System.out.println("Print Name and Activities");
    printNameAndActivities();
    System.out.println("Print Name and Activities on Condition");
    printNameAndActivitiesUsingCondition();
  }
}
