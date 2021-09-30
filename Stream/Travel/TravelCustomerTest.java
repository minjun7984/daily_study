package Travel;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String args[]){

        TravelCustomer customerLee = new TravelCustomer("정민준",26,100);
        TravelCustomer customerKim = new TravelCustomer("김민준",40,100);
        TravelCustomer customerHong = new TravelCustomer("홍민준",13,50);

        List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 명단 출력");
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));

        System.out.println("여행 비용");
        System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());

        System.out.println("나이 20세 이상 고객이름 정렬");
        customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
    }
}
