package theory.lecture_14.properties;

import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;


public class PropertiesServiceTests {
    private PropertiesService service = new PropertiesService();
    private static final String SOURCE = "resources/academy.properties";

    @Test
    public void shouldLoadProperties() {
        //run
        Properties result = service.loadProperties(SOURCE);

        //verify
        Assert.assertEquals("java", result.getProperty("language"));
        Assert.assertEquals("Anton", result.getProperty("name"));
    }
}
