package theory.lecture_14.localization;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Example_1 {

    public static void main(String[] args) throws Exception {
        Locale l1 = new Locale("ru", "RU");// ISO-639 ISO-3166
        //ru RU uk UA   de DE
//        Locale l2 = Locale.getDefault();
//        System.out.println(l2.getLanguage() + l2.getCountry());
        System.out.println(l1.getDisplayLanguage() + l1.getDisplayCountry());

        NumberFormat rubFormat = NumberFormat.getNumberInstance(l1);
        Number n = rubFormat.parse("10.250"); // если 10.25 то округляет??
        System.out.println(n.doubleValue());

        Date date = new Date();

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l1);
        System.out.println(df.format(date));

    }
}
