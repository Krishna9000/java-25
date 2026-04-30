import java.util.function.Predicate;

class PredicateInterface {
  public static void main(String[] args) {
    Predicate<Integer> isEven = number -> number % 2 == 0;
    Predicate<Integer> isDivisibleByFive = number -> number % 5 == 0;
    System.out.println("is 4 a even number: " + isEven.test(4));
    System.out.println("is 10 even and divisible by 5: " + isEven.and(isDivisibleByFive).test(10));
    System.out.println("is 10 not even and not divisible by 5: " + isEven.and(isDivisibleByFive).negate().test(10));
    System.out.println("is 8 even or divisible by 5: " + isEven.or(isDivisibleByFive).test(8));
  }
}
