package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args){

        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");
        //새로운 연산을 수행하기 위해선 기존의 스트림 재사용x stream()메서드 호출하여 스트림 다시생성해야
        Stream<String> stream = sList.stream();
        stream.forEach(s-> System.out.println(s));

        sList.stream().sorted().forEach(s-> System.out.print(s + "\t"));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(n-> System.out.print(n+"\t"));
        System.out.println();
        sList.stream().filter(s->s.length() >=5).forEach(s-> System.out.println(s));
    }
}
