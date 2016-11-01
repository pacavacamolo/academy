package theory.lecture_8;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class Bob {

    public void swim_10() throws Exception, Error {
        System.err.println("заплыли на 10м");
        swim_20();
        System.err.println("уплываем с 10м");
    }

    private void swim_20() throws APIException {
        System.err.println("заплыли на 20м");
        try (PrintStream stream = new PrintStream(new File("directory"))) {
            swim_50();
        } catch (Exception t) {
            throw new APIException(t.getMessage());
        }




        System.err.println("уплываем с 20м");
    }

    private void swim_50() throws IOException {
        System.err.println("заплыли на 50м");

        throw new IOException("акула");


        //System.out.println("жемчуг");
        //System.out.println("уплываем с 50м");
    }
}
