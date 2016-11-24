package theory.lecture_15.behavior.command;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock bought");
    }

    public void sell() {
        System.out.println("Stock sell");
    }
}
