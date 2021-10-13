package InputOutput;
// 유일하게 read write 모두 제공하는 클래스
// 주로 중간중간 파일 포인터가 이동을 할 때 이용
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf= new RandomAccessFile("random.txt","rw");

        rf.writeInt(100);
        System.out.println("pos: " + rf.getFilePointer());
        rf.writeDouble(3.14);
        System.out.println("pos: "+ rf.getFilePointer());
        rf.writeUTF("안녕하세요");
        System.out.println("pos: " + rf.getFilePointer());

        rf.seek(0); //맨 앞으로 가라

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
