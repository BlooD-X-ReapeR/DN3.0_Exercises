public class SingletonPatternTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Logger 1");
        logger2.log("Logger 2");

        System.out.println("Are both instances the same? " + (logger1 == logger2));
    }
}
