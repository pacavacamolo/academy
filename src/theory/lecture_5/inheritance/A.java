package theory.lecture_5.inheritance;

public class A {
    protected int variable = 10;

    static {
        System.out.println("статический блок предка");
    }

    {
        System.out.println("логический блок предка");
    }

    //по умолчанию класс всегда имеет конструктор без параметров
    public A() {
        System.out.println("конструктор предка");
    }

    public int getVariable() {
        return variable;
    }

    public void setVariable(int variable) {
        this.variable = variable;
    }
}
