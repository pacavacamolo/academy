package theory.lecture_1.oopExample;

public class Robo {
    int fuel = 20;

    public void move() {
        fuel = fuel - 1;
    }

    //-----getters and setters----------
    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
