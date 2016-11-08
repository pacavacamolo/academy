package theory.lecture_10.io;

/**
 * Created by Антон on 06.11.2016.
 */
public interface Copier {
    /**
     * copy information from resource file to destination
     */
    void copy(String resource, String destination);
}
