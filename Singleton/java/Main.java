public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("s1 and s2 is the same instance.");
        } else {
            System.out.println("s1 and s2 is NOT the same instance.");
        }
        System.out.println("End.");
    }
}