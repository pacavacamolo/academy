package theory.xml.example_6_SaxParser;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Main {
    public static void main(String[ ] args) {
        try {
// создание SAX-анализатора
            XMLReader reader = XMLReaderFactory.createXMLReader();
            StudentHandler handler = new StudentHandler();
            reader.setContentHandler(handler);
            reader.parse("src/theory/xml/example_6_SaxParser/data/students.xml");
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера " + e);
        } catch (IOException e) {
            System.err.print("ошибка I/О потока " + e);
        }
    }
}
