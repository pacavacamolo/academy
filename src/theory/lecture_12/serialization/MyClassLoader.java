package theory.lecture_12.serialization;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader{

    public MyClassLoader(ClassLoader parent) {
        super(parent);
    }

    public Class loadClass(String name) throws ClassNotFoundException {

        byte[] classData = null;
        if(!"theory.lecture_12.serialization.Triangle".equals(name))
            return super.loadClass(name);


        try (FileInputStream fis = new FileInputStream("D:\\study\\st\\out\\production\\st\\theory\\lecture_12\\serialization\\Triangle.class"); ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            int data = fis.read();

            while (data != -1) {
                out.write(data);
                data = fis.read();
            }
            classData = out.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return defineClass("theory.lecture_12.serialization.Triangle",
                classData, 0, classData.length);
    }

}
