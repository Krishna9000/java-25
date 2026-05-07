import data.Student;
import data.StudentDatabase; 
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;

class MinByMaxBy {
  public static Optional<Student> minByEx() {
    return StudentDatabase.getAllStudents().stream()
      .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
  }

  public static Optional<Student> maxByEx() {
    return StudentDatabase.getAllStudents().stream()
      .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
  }

  public static void main(String[] args) {
    System.out.println("Student with least gpa: " + minByEx());   
    System.out.println("Student with highest gpa: " + maxByEx());   
  }
}
