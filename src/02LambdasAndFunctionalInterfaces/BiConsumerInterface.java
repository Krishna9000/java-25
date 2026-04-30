import java.util.function.BiConsumer;

class BiConsumerInterface {
  public static void main(String[] args) {
    BiConsumer<String, String> biConsumer = (a, b) -> {
      System.out.println("a :" + a + ", b: " +b);
    };

    biConsumer.accept("Rama", "Kalidindi");

    BiConsumer<Integer, Integer> multiply = (a, b) -> {
      System.out.println("Multiplication is : " + (a * b));
    };

    BiConsumer<Integer, Integer> division = (a, b) -> {
      System.out.println("Division is : " + (a / b));
    };

    multiply.andThen(division).accept(5, 5);
  }
}
