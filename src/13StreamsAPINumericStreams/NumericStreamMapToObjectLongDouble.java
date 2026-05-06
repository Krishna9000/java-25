import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

class NumericStreamMapToObjectLongDouble {

  public static List<Integer> mapToObject() {
    return IntStream.rangeClosed(1, 5)
      .mapToObj( i -> {
        return new Integer(i);
      })
      .collect(Collectors.toList());
  }

  public static long mapToLong() {
    return IntStream.rangeClosed(1, 5)
      .mapToLong(i -> i)
      .sum();
  }

  public static double mapToDouble() {
    return IntStream.rangeClosed(1, 5)
      .mapToDouble(i -> i)
      .sum();
  }

  public static void main(String[] args) {
    System.out.println(mapToObject());
    System.out.println(mapToLong());
    System.out.println(mapToDouble());
  }

}
