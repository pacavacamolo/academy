package theory.lecture_5.polimorphism;

public class B extends A {
    private String variable;
    private static String staticVar;

    static {
        staticVar = "статическая переменная потомка - метод переопределен!!!";
    }

    {
        variable = "переменная потомка - метод переопределен!!!";
    }

    @Override
    public String getVariable() {
        return variable;
    }

    //@Override компилятор ругается, т.к. нельзя переопределить static переменную
    public static String getStaticVar() {
        return staticVar;
    }
}
