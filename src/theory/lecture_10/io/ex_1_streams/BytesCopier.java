package theory.lecture_10.io.ex_1_streams;

import org.apache.log4j.Logger;
import theory.lecture_10.io.Copier;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * это пример использования I/O потоков
 * FileInputStream нужен для чтения побайтно из файла,
 * FileOutputStream нужен для записи в файл.
 * чтение из файла происходит до тех пор, пока не будет прочитано -1 - это признак конца файла
 */
public class BytesCopier implements Copier {
    private static Logger logger = Logger.getLogger(BytesCopier.class);

    @Override
    public void copy(String resource, String destination) {
        try (FileInputStream in = new FileInputStream(resource); FileOutputStream out= new FileOutputStream(destination)) {
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
