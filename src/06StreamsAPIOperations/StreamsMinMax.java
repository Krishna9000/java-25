import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

class StreamsMinMax {

  public static int findMaxValue(List<Integer> integerList) {
    return integerList.stream()
      .reduce(0, (x, y) -> x > y ? x : y);
  }
   
  public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
    return integerList.stream()
      .reduce((x, y) -> x > y ? x : y );
  }

  public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
    return integerList.stream()
      .reduce((x, y) -> x < y ? x : y);
  }

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(5, 6, 7, 8, 9, 10);
    List<Integer> emptyIntegerList = new ArrayList<>();
    System.out.println(findMaxValue(integerList));
    System.out.println(findMaxValue(emptyIntegerList));
    Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
    if (maxValueOptional.isPresent()) {
      System.out.println("Max Value optional is: " + maxValueOptional.get());
    } else {
      System.out.println("Optional returned, no value found");
    }

    Optional<Integer> minValueOptional = findMinValueOptional(integerList);
    if(minValueOptional.isPresent()) {
      System.out.println("Min value is : " + minValueOptional.get());
    } else {
      System.out.println("No input has been provided");
    }
  } 

}
