import data.Student;
import data.StudentDatabase;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

class LimitSkip {

  public static Optional<Integer> limit(List<Integer> integerList) {
    return integerList.stream()
      .limit(2)
      .reduce((x, y) -> x + y);
  }

  public static Optional<Integer> skip(List<Integer> integerList) {
    return integerList.stream()
      .skip(2)
      .reduce((x, y) -> x + y);
  }

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
    Optional<Integer> limitResultOptional = limit(integers);
    if(limitResultOptional.isPresent()) {
      System.out.println("The result is : " + limitResultOptional.get());
    } else {
      System.out.println("No inputs has been provided");
    }

    Optional<Integer> skipResultOptional = skip(integers); 
    if(skipResultOptional.isPresent()) {
      System.out.println("The result is : " + skipResultOptional.get());
    } else {
      System.out.println("No input provided");
    }
  }
}
