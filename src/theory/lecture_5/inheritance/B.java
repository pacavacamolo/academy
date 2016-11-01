package theory.lecture_5.inheritance;

public class B extends A {

    private final static String url;

    // в статическом блоке можно, например, проинициализировать статические переменные
    // статический блок выполняется при загрузке класса загрузчиком (Class Loader)
    static {
        System.out.println("статический блок потомка");
        url = "10.10.2.168";
    }

    {
        System.out.println("логический блок потомка");
    }

    // конструктор без параметров
    public B() {
        System.out.println("конструктор потомка");
        System.out.println("объект класса потомка имеет в себе поля предка: поле variable = " + variable);
    }

    // конструктор с параметром
    public B(int variable) {
        //super() - вызов конструктора предка, у нас нет надобности его тут вызывать, потому что и так вызывается конструктор предка по умолчанию
        //но если нам понадобится вызвать другой конструктор, это нам пригодится.
        //super();
        System.out.println("конструктор потомка");
        this.setVariable(variable);
    }
}
