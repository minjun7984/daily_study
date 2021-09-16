package HashSet;

public class MemberArrayListTest {

    public static void main(String[] args){

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberJung = new Member(1001, "정민준");
        Member memberKim = new Member(1002, "김민준");
        Member memberLee = new Member(1003, "이민준");


        memberHashSet.addMember(memberJung);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberLee);


        Member memberHong = new Member(1003, "홍민준");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();

    }
}
