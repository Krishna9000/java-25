import java.util.function.Function;

class FunctionInterface {
    
  static Function<String, String> function = name -> name.toUpperCase();
  static Function<String, String> function2 = name -> name.concat(" - Functional Programming");
  static Function<String, String> function3 = name -> name.concat(" - Compose");
  static Function<String, String> function4 = name -> name.toLowerCase();

  public static void main(String[] args) {
    System.out.println("The Result is : " + function.apply("java8"));
    System.out.println("The Result is : " + function.andThen(function2).apply("java8"));
    System.out.println("The Result of Compose is : " + function.compose(function2).andThen(function4).compose(function3).apply("java8"));
  }
}
