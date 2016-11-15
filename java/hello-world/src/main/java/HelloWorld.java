public class HelloWorld {

    public static String hello(String name) {
      return String.format("Hello, %s!", isEmpty(name) ? "World" : name);
    }

    private static boolean isEmpty(String name) {
        return name == null || name.isEmpty();
    }

}
