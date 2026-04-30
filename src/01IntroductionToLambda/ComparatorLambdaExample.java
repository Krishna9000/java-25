import java.util.Comparator;

class ComparatorLambdaExample {
  public static void main(String[] args) {
    //prior to java 8
    Comparator<Integer> comparator = new Comparator<Integer>() {
      @Override
      public int compare(Integer integer1, Integer integer2) {
        return integer1.compareTo(integer2);
      }
    };

    System.out.println("Result of the comparator is : " + comparator.compare(3, 2));

    // After java 8
    Comparator<Integer> comparatorLambda = (integer1, integer2) -> integer1.compareTo(integer2);
    System.out.println("Result of lambda comparator is : " + comparatorLambda.compare(2, 3));
  }
}
