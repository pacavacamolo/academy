package theory.xml.example_5_jaxb_unmarshal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import theory.xml.example_4_jaxb_marshal.Students;

public class Main {
    public static void main(String[ ] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Students.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();

            Students students = (Students) unmarshaller.unmarshal(new File("src/theory/xml/example_5_jaxb_unmarshal/students.xml"));
            System.out.println(students);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
