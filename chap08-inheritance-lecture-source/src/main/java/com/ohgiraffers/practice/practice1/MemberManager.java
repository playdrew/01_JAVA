package com.ohgiraffers.practice.practice1;

public class MemberManager {

    public void sign(){
        MemberDTO[] members = new MemberDTO[2];
        members[0] = new MemberDTO("id01","pwd01");
        members[1] = new MemberDTO("id02","pwd02");
        SpecSign ss = new SpecSign();
        ss.insert(members);

    }

    public void search(){
        SpecSearch sa = new SpecSearch();
        MemberDTO[] result = sa.sear();

        for(MemberDTO member : result){
            System.out.println(member.toString() + "만큼 등록되었습니다");
        }

        System.out.println(result.length + "만큼 조회되었습니다.");

    }
}
