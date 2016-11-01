package theory.lecture_6;

/**
 * Created by StudentTC on 25.10.2016.
 */
public class OuterClass {
    private int x;

    private int method(){
        class InnerClass {
            private int method() {
                return 1;
            }
        }

        return 10;



    }

    public static NestedClass getNested() {
        return new NestedClass();
    }

    public static class NestedClass {
        private static int method2() {
            method2();
            return 2;
        }
    }


}
