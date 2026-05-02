import java.util.function.Supplier;
import data.Student;
import java.util.Arrays;

class SupplierInterface {
  public static void main(String[] args) {
    Supplier<Student> studentSupplier = () -> {
      return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "football", "baseball"));
    };
    System.out.println(studentSupplier.get());
  }
}
