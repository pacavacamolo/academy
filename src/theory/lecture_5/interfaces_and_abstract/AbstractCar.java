package theory.lecture_5.interfaces_and_abstract;

public abstract class AbstractCar implements Runnable {
    protected int transmission;
    protected int speed;
    protected int fuel;

    //мы переопределяем на этом уровне метод run, но детали реализации оставим абстрактными чтобы переопределить их в классах-наследниках
    @Override
    public void run() {
        //этот метод зададим у классов-потомков, на этом уровне мы ничег оне хотим знать про реализацию включения передачи
        setTransmission(1);
        increaseSpeed();
    }

    public abstract void setTransmission(int transmission);

    public void increaseSpeed() {
        speed++;
    }

}
