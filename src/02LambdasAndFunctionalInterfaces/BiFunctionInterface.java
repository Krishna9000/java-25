import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import data.Student;
import data.StudentDatabase;

class BiFunctionInterface {

  static Predicate<Student> studentPredicate = student -> student.getGpa() >= 3.9;
  static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunctionStudent = (students, studentPredicate) -> {
    Map<String, Double> studentList = new HashMap<>();
    students.forEach(student -> {
      if(studentPredicate.test(student)) {
        studentList.put(student.getName(), student.getGpa());
      }
    });
    return studentList;
  };

  public static void main(String[] args) {
     System.out.println(biFunctionStudent.apply(StudentDatabase.getAllStudents(), studentPredicate)); 
  }
}
