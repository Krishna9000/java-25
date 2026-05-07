import data.Student;
import data.StudentDatabase;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.Optional;

class GroupingBy {

  public static void groupStudentsByGender() {
    Map<String, List<Student>> students = StudentDatabase.getAllStudents().stream()
      .collect(Collectors.groupingBy(Student::getGender));
    System.out.println(students);
  }

  public static void groupStudentsByGpa() {
    Map<String, List<Student>> students = StudentDatabase.getAllStudents().stream()
      .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average"));
    System.out.println(students);
  }

  public static void groupStudentsByTwoLevels() {
    Map<Integer, Map<String, List<Student>>> studentMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.groupingBy(Student::getGradeLevel, 
          Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average")));
    System.out.println(studentMap);
  }

  public static void groupStudentsByTwoLevelsTwo() {
    Map<Integer, Integer> studentMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.groupingBy(Student::getGradeLevel, 
          Collectors.summingInt(Student::getNoOfNotebooks)));
    System.out.println(studentMap);
  }

  public static void groupStudentsByTwoLevelsThree() {
    Map<String, Integer> studentMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.groupingBy(Student::getName, 
          Collectors.summingInt(Student::getNoOfNotebooks)));
    System.out.println(studentMap);
  }

  public static void groupStudentsByThreeLevels() {
    LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
    System.out.println(studentLinkedHashMap);
  }

  public static void calculateTopGpa() {
    Map<Integer, Optional<Student>> studentGradeOptional = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.groupingBy(Student::getGradeLevel, 
            Collectors.maxBy(Comparator.comparing(Student::getGpa))));
    System.out.println(studentGradeOptional);
  }

  public static void calculateTopGpaTwo() {
    Map<Integer, Student> studentGradeMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.groupingBy(Student::getGradeLevel,
            Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    System.out.println(studentGradeMap);
  }

  public static void calculateLowGpaTwo() {
    Map<Integer, Student> studentGradeMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.groupingBy(Student::getGradeLevel,
            Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
    System.out.println(studentGradeMap);
  }

  public static void main(String[] args) {
    //groupStudentsByGender();
    //groupStudentsByGpa();
    //groupStudentsByTwoLevels();
    //groupStudentsByTwoLevelsTwo();
    //groupStudentsByTwoLevelsThree();
    //groupStudentsByThreeLevels();
    //calculateTopGpa();
    //calculateTopGpaTwo();
    calculateLowGpaTwo();
  }

}
