package ArrayList;

public class MemberArrayListTest {

    public static void main(String[] args){

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberJung = new Member(1001, "정민준");
        Member memberKim = new Member(1002, "김민준");
        Member memberLee = new Member(1003, "이민준");
        Member memberHong = new Member(1004, "홍민준");

        memberArrayList.addMember(memberJung);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();
        memberArrayList.removeMember(memberKim.getMemberId());
        memberArrayList.showAllMember();
    }
}
