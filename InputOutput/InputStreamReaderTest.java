package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args){
        // 보조스트림은 +a로 기능을 제공함
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
            int i;

            while((i = isr.read()) != -1){
                System.out.print((char)i);
            }
        }catch(IOException e){

        }
    }
}
