package theory.http;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String tutByContent = HttpClientHelper.get("http://tut.by/");
        System.out.println(tutByContent);

        String jobsTutByContent = HttpClientHelper.get("http://jobs.tut.by/vacancy/18027625");
        System.out.println(tutByContent);

    }
}
