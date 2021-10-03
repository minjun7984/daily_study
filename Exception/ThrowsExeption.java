package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {

        ThrowsExeption test = new ThrowsExeption();
        try {
            test.loadClass("Exception/a.txt", "abc");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(Exception e) { //최상위 Exception

        }
    }
}
