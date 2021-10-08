//파일을 읽고 복제하는 프로그램 BufferedInputStream이란 보조스트림 이용해 속도가 더욱 빨라짐
package InputOutput;

import java.io.*;

public class FileCopyTest {

    public static void main(String[] args) {

        long millisecond = 0;  //복사시간을 계산하기 위한 변수

        try (BufferedInputStream bis = new BufferedInputStream( new FileInputStream("a.zip"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {

            millisecond = System.currentTimeMillis();
            int i;
            while((i = bis.read())!= -1){
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + "소요되었습니다.");
    }
}
