import java.util.function.BinaryOperator;
import java.util.Comparator;

class BinaryOperatorInterface {

  static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
  public static void main(String[] args) {
    BinaryOperator<Integer> binaryOperator = (value1, value2) -> value1 * value2;
    BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
    System.out.println(binaryOperator.apply(2, 3));
    System.out.println(maxBy.apply(4,5));
    System.out.println(minBy.apply(4,5));
  }
}
