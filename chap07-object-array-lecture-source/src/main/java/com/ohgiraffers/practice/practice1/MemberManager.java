package com.ohgiraffers.practice.practice1;

public class MemberManager {
    public void signup() {

        MemberDTO[] members = new MemberDTO[2];
        members[0] = new MemberDTO("id01","pwd01");
        members[1] = new MemberDTO("id02","pwd02");
        SpecSign ss = new SpecSign();
        ss.insert(members);


    }

    public void search() {
        SpecSearch sa = new SpecSearch();
        MemberDTO[] result = sa.sear();
        for(MemberDTO members : result){
            System.out.println(members);
        }
        System.out.println("총 " + result.length + "명의 회원이 가입되어 있습니다!!!");

    }
}
