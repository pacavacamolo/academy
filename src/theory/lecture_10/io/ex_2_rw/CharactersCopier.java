package theory.lecture_10.io.ex_2_rw;

import org.apache.log4j.Logger;
import theory.lecture_10.io.Copier;

import java.io.*;

/**
 * это пример использования I/O потоков
 * FileReader, FileWriter очень похожи с байтовыми,
 * разница только в том, что символьные потоки, которые сделаны на основе байтовых,
 * оперируют символами (16 бит) а не байтами (8 бит) и таким образом служат мостом между байтами и символами
 */
public class CharactersCopier implements Copier {
    private static Logger logger = Logger.getLogger(CharactersCopier.class);

    // можно читать аналогично байтовым потокам
    @Override
    public void copy(String resource, String destination) {
        try (FileReader in = new FileReader(resource); FileWriter out= new FileWriter(destination)) {
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }
}
