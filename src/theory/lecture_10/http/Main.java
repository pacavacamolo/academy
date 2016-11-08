package theory.lecture_10.http;

import org.apache.log4j.Logger;

import java.io.IOException;


public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        String tutByContent = HttpClientHelper.get("http://tut.by/");
        logger.info(tutByContent);
        //System.out.println(tutByContent);
    }
}
