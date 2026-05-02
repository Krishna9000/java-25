import java.util.function.UnaryOperator;

class UnaryOperatorInterface {

  static UnaryOperator<String> unaryOperator = string -> string.concat(" - Programming ");
  public static void main(String[] args) {
    System.out.println(unaryOperator.apply("Java 8"));
  }
}
