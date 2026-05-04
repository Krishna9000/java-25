import data.Student;
import data.StudentDatabase;

class AllMatchAnyMatchNoneMatch {

  public static boolean allMatch() {
    return StudentDatabase.getAllStudents().stream()
      .allMatch(student -> student.getGpa() >= 3.5);
  }

  public static boolean anyMatch() {
    return StudentDatabase.getAllStudents().stream()
      .anyMatch(student -> student.getGpa() >= 4.0);
  }

  public static boolean noneMatch() {
    return StudentDatabase.getAllStudents().stream()
      .noneMatch(student -> student.getGpa() >= 4.1);
  }

  public static void main(String[] args) {
    System.out.println("Result of all match: " + allMatch());
    System.out.println("Result of any match: " + anyMatch());
    System.out.println("Result of any match: " + noneMatch());
  }

}
