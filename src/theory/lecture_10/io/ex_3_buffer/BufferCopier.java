package theory.lecture_10.io.ex_3_buffer;

import org.apache.log4j.Logger;
import theory.lecture_10.io.Copier;

import java.io.*;

/**
 * это пример использования I/O потоков
 * FileReader, FileWriter очень похожи с байтовыми,
 * разница только в том, что символьные потоки, которые сделаны на основе байтовых,
 * оперируют символами (16 бит) а не байтами (8 бит) и таким образом служат мостом между байтами и символами
 */
public class BufferCopier implements Copier {
    private static Logger logger = Logger.getLogger(BufferCopier.class);

    @Override
    public void copy(String resource, String destination) {
        try (BufferedReader in = new BufferedReader(new FileReader(resource));
             PrintWriter out= new PrintWriter(new FileWriter(destination))) {
            String s;

            while ((s = in.readLine()) != null) {
                out.write(s);
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
