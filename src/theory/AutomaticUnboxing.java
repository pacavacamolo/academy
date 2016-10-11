package theory;

public class AutomaticUnboxing {
    public static void main(String[] args) {
        Integer x = null;
        Integer y = testInt(x);
        System.out.println(y);
    }

    private static Integer testInt(int x) {
        return x;
    }
}
