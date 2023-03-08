public class Main {
    public static void main(String[] args) {

        final var singleton1 = Singleton.getInstance();
        final var singleton2 = Singleton.getInstance();
        System.out.println(singleton1.equals(singleton2));
    }
}