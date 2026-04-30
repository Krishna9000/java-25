import java.util.function.Function;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import data.Student;
import data.StudentDatabase;

class FunctionStudentInterface {

  static Function<List<Student>, Map<String, Double>> studentFunction = students -> {
    Map<String, Double> studentGradeMap = new HashMap<>();
    students.forEach(student -> {
      studentGradeMap.put(student.getName(), student.getGpa());
    });
    return studentGradeMap;
  };

  public static void main() {
    System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));
  }
}
