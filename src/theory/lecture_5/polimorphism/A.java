package theory.lecture_5.polimorphism;

public class A {
    //protected - видны в классе-потомке и всем классам, которые находятся в этом же пакете
    protected String variable;
    protected static String staticVar;

    static {
        staticVar = "статическая переменная предка";
    }

    {
        variable = "переменная предка";
    }

    public String getVariable() {
        return variable;
    }

    public static String getStaticVar() {
        return staticVar;
    }
}
