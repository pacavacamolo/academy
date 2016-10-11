package theory.xml.example_4_jaxb_marshal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
        "name",
        "telephone",
        "address"
})
public class Student {

//    Маршаллизация — механизм преобразования данных из java-объектов
//    в конкретное хранилище, будь то документ XML, база данных или простой
//    текстовый файл.
//    Демаршаллизация — обратный процесс преобразования данных из внеш-
//    них источников в структуру хранения, поддерживаемую виртуальной маши-
//    ной.

    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    private String login;
    @XmlElement(required = true)
    private String name;
    @XmlAttribute(required = false)
    private String faculty;
    @XmlElement(required = true)
    private int telephone;
    @XmlElement(required = true)
    private Address address = new Address();
    public Student() { } // необходим для маршаллизации/демаршалиизации XML
    public Student(String login, String name, String faculty, int telephone, Address address) {
        this.login = login;
        this.name = name;
        this.faculty = faculty;
        this.telephone = telephone;
        this.address = address;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String toString() {
        return "\nLogin: " + login + "\nName: " + name + "\nTelephone: " + telephone
                + "\nFaculty: " + faculty + address.toString();
    }

    @XmlRootElement
    @XmlType(name = " address ", propOrder = {
            "city",
            "country",
            "street"
    })
    public static class Address { // внутренний класс
        private String country;
        private String city;
        private String street;
        public Address() {// необходим для маршаллизации/демаршалиизации XML
        }
        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public String getStreet() {
            return street;
        }
        public void setStreet(String street) {
            this.street = street;
        }
        public String toString() {
            return "\nAddress:" + "\n\tCountry: " + country
                    + "\n\tCity: " + city + "\n\tStreet: " + street + "\n";
        }
    }
}
