package theory.lecture_5.inheritance;

public class Main {
    public static void main(String[] args) {
        //мы не можем наследоваться более чем от одного класса

        //при запуске main видна очередность вызова блоков и конструкторов классов А и В
        //класс В наследует А поэтому имеет переменные и методы класса А
        B b = new B();
        System.out.println(b.getVariable());
    }
}
