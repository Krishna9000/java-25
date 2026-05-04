import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import data.Student;
import data.StudentDatabase;

class ReduceStream {

  public static int performMultiplication(List<Integer> integerList) {
    return integerList.stream()
      .reduce(1, (int1, int2) -> int1 * int2);
  }

  public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
    return integerList.stream()
      .reduce((int1, int2) -> int1 * int2);
  }

  public static Optional<Student> getStudentWithHighestGrade() {
    return StudentDatabase.getAllStudents().stream()
      .reduce((s1, s2) -> (s1.getGpa()>s2.getGpa()) ? s1 : s2);
  }

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1, 3, 5, 7);
    Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
    System.out.println(performMultiplication(integers));
    if (result.isPresent()) {
      System.out.println(result.get());
    } else {
      System.out.println("No Such Element");
    }
    System.out.println("Student with highest Gpa");
    Optional<Student> highestGpaStudent = getStudentWithHighestGrade();
    if(highestGpaStudent.isPresent()) {
      System.out.println(highestGpaStudent.get());
    }
  }

}
