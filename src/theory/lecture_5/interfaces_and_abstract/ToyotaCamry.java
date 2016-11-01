package theory.lecture_5.interfaces_and_abstract;

public class ToyotaCamry extends AbstractCar implements AutomaticTransmission{
    @Override
    public void setTransmission(int transmission) {
        setTransmission();
        displayTransmission();
    }

    @Override
    public void setTransmission() {
        if (speed == 0) {
            transmission = 1;
        }
    }

    private void displayTransmission() {
        //доступна из класса-предка
        System.out.println(transmission);
    }
}
