package theory.lecture_3.example_3_builders;

public class Main {

    public static void main(String[] args) {

        //StringBuilder позволяет не создавать при конкатенации (сложении, склеивании строк) каждый раз новую строку.
        StringBuilder sb = new StringBuilder(1);
        prepareBuilder(sb);

        System.out.println(sb.toString());

        //изначально использовался StringBuffer - потокобезопасный, но более медленный. Вот что в его описании:

        //As of release JDK 5, this class has been supplemented with an equivalent class designed for use by a single thread, StringBuilder.
        // The StringBuilder class should generally be used in preference to this one, as it supports all of the same operations but it is faster, as it performs no synchronization.
    }

    //StringBuilder muttable(изменяемый) объект в отличие от String
    private static void prepareBuilder(StringBuilder sb) {
        sb.append("abc")
                .append(1)
                .append('C')
                .append(true)
                .append("</document>")
                .insert(0, "<document>")
        ;
    }
}
