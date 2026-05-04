import java.util.stream.IntStream;
import java.util.stream.LongStream;

class NumbericStreamsRange {
  public static void main(String[] args) {
    IntStream intStream = IntStream.range(1, 50);
    System.out.println(intStream.count());

    IntStream.range(1, 50).forEach(System.out::print);
    System.out.println("");
    IntStream.rangeClosed(1, 50).forEach(System.out::print);
    System.out.println("");
    LongStream.rangeClosed(1, 50).forEach(System.out::print);
    System.out.println("");
    LongStream.rangeClosed(1, 50).asDoubleStream().forEach(System.out::print); 

  }
}
