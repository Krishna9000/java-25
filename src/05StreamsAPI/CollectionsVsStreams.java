import java.util.ArrayList;
import java.util.stream.Stream; 

class CollectionsVsStreams {
  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<>();
    names.add("adam");
    names.add("jim");
    names.add("jenny");

    for(String name : names) System.out.println(name);
    for(String name : names) System.out.println(name);

    names.remove(0);

    System.out.println("Iterating with a stream, can only be done once");
    Stream<String> streamNames = names.stream();
    streamNames.forEach(System.out::println);
    //streamNames.forEach(System.out::println);

    System.out.println(names);
    System.out.println(names.get(1));
  }
}
