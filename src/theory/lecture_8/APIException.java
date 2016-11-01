package theory.lecture_8;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class APIException extends Exception {
    public APIException(String message) {
        super("custom message" + message);
    }
}
