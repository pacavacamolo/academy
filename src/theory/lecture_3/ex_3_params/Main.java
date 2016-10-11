package theory.lecture_3.ex_3_params;

public class Main {
    private final String VALUE_FOR_STRING = "11";

    public static void main(String[] args) {

//        int result = 10;
//        testPrimitive(result);
//        System.out.println(result);

//        String result = "yes";
//        testString(result);
//        System.out.println(result);

        MyObject result = new MyObject();
        String[] mass = new String[1];
        System.out.println(result.toString());
        testObject(result);

        System.out.println(result.getPrimitive());
        System.out.println(result.getString());

        System.out.println(result.toString());


    }

    /**
     * в локальной переменной result хранится значение, которое передается в локальную переменную primitive
     * когда мы меняем primitive, result остается прежним
     */
    public static void testPrimitive(int primitive) {
        primitive = 20;
    }

    /**
     * в локальной переменной result хранится ссылка на область памяти в String pool где хранится "yes".
     * когда мы меняем значение string на "no", ссылка, хранящаяся в String result, не меняется.
     * String в Java - immutable object, т.е. неизменяем. Мы можем поменять ссылку, но не саму строку.
     */
    public static String testString(String string) {
        return "no";
    }

    /**
     *  в локальной переменной result хранится ссылка на область памяти в heap, где хранится объект.
     *  когда мы меняем поля объекта, хранящегося в object переменной, нужно помнить, что меняется и result,
     *  т.к. это один и тот же объект (ссылки у object и result совпадают)
     */
    public static void testObject(MyObject object) {
        object.setPrimitive(20);
        object.setString("no");
    }
}
