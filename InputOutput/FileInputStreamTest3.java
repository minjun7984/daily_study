package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

    public static void main(String[] args){

        int i;
        try(FileInputStream fis = new FileInputStream("input2.txt")){

            byte[] bs = new byte[10];
            //바이트 수가 -1이면 end of file
            while( (i = fis.read(bs)) != -1 ){
                for(int j=0; j<i; j++){
                    System.out.print((char)bs[j]);
                    //남은 메모리 없도록
                }
                System.out.println(" : " + i + "바이트 읽음");
            }
        }   catch(IOException e){
            System.out.println(e);
        }
    }
}