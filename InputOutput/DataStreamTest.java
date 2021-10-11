package InputOutput;
//자료가 메모리에 저장된 상태 그대로 읽거나 쓰는 스트림
import java.io.*;

public class DataStreamTest {

    public static void main(String[] args){

        try(FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos))
        {
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("test");
        }catch(IOException e){
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis))
        {
            //저장된 타입대로 읽어야된다 아니면 깨지는 현상 발생
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
