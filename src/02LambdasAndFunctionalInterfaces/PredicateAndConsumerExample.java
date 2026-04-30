import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.List;
import data.Student;
import data.StudentDatabase;

class PredicateAndConsumerExample {
  
  Predicate<Student> gradeLevelGreaterThanThree = student -> student.getGradeLevel() >= 3;
  Predicate<Student> gpaGreaterThanEqualToThree = student -> student.getGpa() >= 3.9;
  BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + ": " +activities);

  Consumer<Student> studentConsumer = student -> {
    if(gradeLevelGreaterThanThree.and(gpaGreaterThanEqualToThree).test(student)) {
      studentBiConsumer.accept(student.getName(), student.getActivities());
    }
  };

  public void printNameAndActivities(List<Student> studentsList) {
    studentsList.forEach(studentConsumer);
  }

  public static void main(String[] args) {
    List<Student> studentList = StudentDatabase.getAllStudents();
    new PredicateAndConsumerExample().printNameAndActivities(studentList);
  }
}
