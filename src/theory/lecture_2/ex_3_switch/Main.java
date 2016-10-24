package theory.lecture_2.ex_3_switch;

public class Main {
    public static void main(String[] args) {
        // в качестве входящего параметра может быть число, строка, символ а также enum
        String season = "autumn";

        switch (season) {
            case "autumn": {
                System.out.println("Осень!");
            }
            case "winter": {
                System.out.println("Зима!");
            }
            default:{
                System.out.println("ошибка");
            }
        }
    }


}
