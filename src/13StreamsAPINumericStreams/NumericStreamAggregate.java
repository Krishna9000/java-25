import java.util.stream.IntStream;
import java.util.OptionalInt;
import java.util.stream.LongStream;
import java.util.OptionalLong;
import java.util.OptionalDouble;

class NumericStreamAggregate {
  public static void main(String[] args) {
    System.out.println(IntStream.rangeClosed(1, 50).sum());
    OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
    System.out.println(optionalInt.isPresent() ? optionalInt.getAsInt() : "No Input");
    OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
    System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : "No Input");
    OptionalDouble optionalDouble = LongStream.rangeClosed(50, 100).average();
    System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : "No input");
  }
}
