package Comparable;

import Comparable.Member;
import java.util.TreeSet;

public class MemberTreeSetTest {

    public static void main(String[] args){

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberHong= new Member(1004,"홍민준");
        Member memberJung = new Member(1001, "정민준");
        Member memberKim = new Member(1002, "김민준");
        Member memberLee = new Member(1003, "이민준");

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberJung);
        memberTreeSet.addMember(memberLee);


        memberTreeSet.showAllMember();

    }
}
