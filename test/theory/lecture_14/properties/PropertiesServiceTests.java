package theory.lecture_14.properties;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;


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
