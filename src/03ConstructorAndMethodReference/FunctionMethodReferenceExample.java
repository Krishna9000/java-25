import java.util.function.Function;

class FunctionMethodReference {

  static Function<String, String> toUpperCaseLambda = String::toUpperCase;

  public static void main(String[] args) {
    System.out.println(toUpperCaseLambda.apply("java-8"));
  }
}

