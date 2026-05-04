import java.util.stream.Stream;
import java.util.function.Supplier;
import java.util.Random;
class StreamOfGenerateIterate {
  public static void main(String[] args) {
    Stream<String> stringStream = Stream.of("adam", "dan", "julie");
    stringStream.forEach(System.out::println);

    Stream.iterate(1, x -> x * 2)
      .limit(10)
      .forEach(System.out::println);

    Supplier<Integer> integerSupplier = new Random()::nextInt;
    Stream.generate(integerSupplier)
      .limit(100)
      .forEach(System.out::println);
  }
}
