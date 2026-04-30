import java.util.function.BiPredicate;
import java.util.List;
import data.StudentDatabase;
import data.Student;

class BiPredicateInterface {
  public static void main(String[] args) {
    BiPredicate<Integer, Double> gradeLevelGpaGreaterThanThreeAndThreePointNine = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    List<Student> listOfStudents = StudentDatabase.getAllStudents();
    listOfStudents.forEach(student -> {
      if(gradeLevelGpaGreaterThanThreeAndThreePointNine.test(student.getGradeLevel(), student.getGpa())) {
        System.out.println(student);
      }
    });
  }
}
