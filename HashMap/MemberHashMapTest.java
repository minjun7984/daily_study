package HashMap;

import HashMap.Member;

import java.util.HashMap;

public class MemberHashMapTest {

    public static void main(String[] args){

        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberHong= new Member(1004,"홍민준");
        Member memberJung = new Member(1001, "정민준");
        Member memberKim = new Member(1002, "김민준");
        Member memberLee = new Member(1003, "이민준");

        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberJung);
        memberHashMap.addMember(memberLee);

        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Jung");
        hashMap.put(1004, "Hong");

        System.out.println(hashMap);
    }
}
