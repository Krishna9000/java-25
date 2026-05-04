import data.StudentDatabase;
import data.Student;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Predicate;

class StreamsExample {
  public static void main(String[] args) {

    Predicate<Student> gradeLevelGreaterThanEqualToThree = student -> student.getGradeLevel() >= 3;
    Predicate<Student> gpaGreaterThanEqualToThreePointNine = student -> student.getGpa() >= 3.9;

    Map<String, List<String>> studentActivitiesMap = StudentDatabase.getAllStudents().parallelStream()
      .peek(student -> {
        System.out.println(student);
      })
      .filter(gradeLevelGreaterThanEqualToThree)
      .peek(student -> {
        System.out.println("After the first filter " + student);
      })
      .filter(gpaGreaterThanEqualToThreePointNine)
      .peek(student -> {
        System.out.println("After the second filter " + student);
      })
      .collect(Collectors.toMap(Student::getName, Student::getActivities));

    System.out.println(studentActivitiesMap);

  }
}
