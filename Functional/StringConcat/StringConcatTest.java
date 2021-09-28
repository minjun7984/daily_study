package StringConcat;

public class StringConcatTest {

    public static void main(String[] args){

        String s1 = "Hello";
        String s2 = "World";
        //클래스 생성하는 경우
        StringConcatImpl strIml = new StringConcatImpl();
        strIml.makeString(s1,s2);


        //람다식 내부적으로 익명 내부 클래스가 만들어진다  
        StringConcat concat = (s, v)-> System.out.println(s+ "," +v);
        concat.makeString(s1,s2);
    }
}
