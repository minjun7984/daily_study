package Exception;

public class ArrayIndexException {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5};

        try {
            for(int i =0; i<=5; i++) {
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        System.out.println("here!!!");//에러문 하지 않으면 here은 출력되지 않는다
        }
    }


