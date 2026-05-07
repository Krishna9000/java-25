import java.util.stream.IntStream;
import java.util.function.Supplier;

class ParallelStream {

  public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {
    long startTime = System.currentTimeMillis();
    for(int i = 0; i < numberOfTimes; i++) {
      supplier.get();
    }
    return System.currentTimeMillis() - startTime;
  }

  public static int sequentialSum() {
    return IntStream.rangeClosed(1, 1000000)
      .sum();
  }

  public static int parallelSum() {
    return IntStream.rangeClosed(1, 1000000)
      .parallel()
      .sum();
  }

  public static void main(String[] args) {
    System.out.println(Runtime.getRuntime().availableProcessors());
    System.out.println("Sequential Summation: " + checkPerformanceResult(ParallelStream::sequentialSum, 20));
    System.out.println("Parallel Summation: " + checkPerformanceResult(ParallelStream::parallelSum, 20));
  }
}
