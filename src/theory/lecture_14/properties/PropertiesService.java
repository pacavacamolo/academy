package theory.lecture_14.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertiesService {
    private static Logger logger = Logger.getLogger(PropertiesService.class);

    private static Properties properties = new Properties();

    public Properties loadProperties(String source) {
        try(FileInputStream input = new FileInputStream(source)) {
            properties.load(input);

        } catch (IOException e) {
            logger.error(e);
        }

        return properties;
    }
}
