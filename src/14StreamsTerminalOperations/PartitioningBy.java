import data.Student;
import data.StudentDatabase;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.Map;
import java.util.List;
import java.util.Set;

class PartitioningBy { 

  public static void partitioningByOne() {
    Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8; 
    Map<Boolean, List<Student>> studentMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.partitioningBy(gpaPredicate));
    System.out.println(studentMap);
  }

  public static void partitioningByTwo() {
    Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8; 
    Map<Boolean, Set<Student>> studentMap = StudentDatabase.getAllStudents()
      .stream()
      .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
    System.out.println(studentMap);
  }
  
  public static void main(String[] args) {
    partitioningByOne();
    partitioningByTwo();
  }

}
