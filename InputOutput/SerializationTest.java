package InputOutput;

import java.io.*;

class Person implements Serializable{

    String name;
    String job;

    public Person(){}

    public Person(String name, String job){
        this.name =name;
        this.job = job;
    }

    public String toString(){
        return name+","+job;
    }
}

public class SerializationTest {

    public static void main(String[] args){

        Person2 personLee = new Person2("정민준","대표이사");
        Person2 personKim = new Person2("김민준","상무이사");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream ois = new ObjectOutputStream(fos)){

            ois.writeObject(personLee);
            ois.writeObject(personKim);
        }catch(IOException e){
            System.out.println(e);
        }

        try(FileInputStream fos = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fos)){

            Person2 pLee =(Person2)ois.readObject();
            Person2 pKim= (Person2)ois.readObject();

            System.out.println(pLee);
            System.out.println(pKim);

        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
