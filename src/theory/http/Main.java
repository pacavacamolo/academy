package theory.http;

import java.io.IOException;

/**
 *
 */
public class Main {
    public static void main(String[] args) throws IOException{
        HttpClientHelper helper = new HttpClientHelper();

        String result = HttpClientHelper.get("http://tut.by");

        System.out.println(result);
    }
}
