import data.Student;
import data.StudentDatabase;
import java.util.function.Predicate;
import java.util.List;

class PredicateStudentExample {
  public static void main(String[] args) {
    Predicate<Student> gradeLevelGreaterThanEqualToThree = student -> student.getGradeLevel() >= 3;
    Predicate<Student> gpaGreaterThanEqualToThreePointNine = student -> student.getGpa() >=3.9;
    List<Student> listOfStudents = StudentDatabase.getAllStudents();

    System.out.println("list of students with grade level greater than or equal to 3");
    listOfStudents.forEach(student -> {
      if(gradeLevelGreaterThanEqualToThree.test(student)) {
        System.out.println(student);
      }
    });

    System.out.println("list of students with gpa level greater than 3.9");
    listOfStudents.forEach(student -> {
      if(gpaGreaterThanEqualToThreePointNine.test(student)) {
        System.out.println(student);
      }
    });

    System.out.println("list of students with gpa >= 3.9 and grade level greater than or equal to 3");
    listOfStudents.forEach(student -> {
      if(gpaGreaterThanEqualToThreePointNine.and(gradeLevelGreaterThanEqualToThree).test(student)) {
        System.out.println(student);
      } 
    });
 
    System.out.println("list of students with gpa >= 3.9 or grade level greater than or equal to 3");
    listOfStudents.forEach(student -> {
      if(gpaGreaterThanEqualToThreePointNine.or(gradeLevelGreaterThanEqualToThree).test(student)) {
        System.out.println(student);
      } 
    });
 
  }
}
