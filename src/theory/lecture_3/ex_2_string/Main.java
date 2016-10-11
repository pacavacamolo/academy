package theory.lecture_3.ex_2_string;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        //Строки являются переменными ссылочного типа.
        //String s1 = "abc" не создает объект в heap, строка будет храниться в String Pool (область Permanent Generation)
        //String s2 = "abc" в s2 будет храниться та же ссылка, что и в s1.
        // При сравнении == сравниваются ссылки, и строки окажутся равны.

        if (s1 == s2) {
            System.out.println("пример 1");
        }

        s2 = new String("abc");

        //Теперь равенства не будет, т.к. мы явно указали JVM создать новый объект.
        if (s1 == s2) {
            System.out.println("пример 2");
        }

        //из описания метода intern()

        /**
         * When the intern method is invoked, if the pool already contains a
         * string equal to this {@code String} object as determined by
         * the {@link #equals(Object)} method, then the string from the pool is
         * returned. Otherwise, this {@code String} object is added to the
         * pool and a reference to this {@code String} object is returned.
         * <p>
         * All literal strings and string-valued constant expressions are
         * interned. String literals are defined in section 3.10.5 of the
         */
        if (s1 == s2.intern()) {
            System.out.println("пример 3");
        }
    }
}
