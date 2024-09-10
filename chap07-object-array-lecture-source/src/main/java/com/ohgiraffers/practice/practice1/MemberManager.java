package com.ohgiraffers.practice.practice1;

public class MemberManager {

    public void signup(){
        MemberDTO[] member = new MemberDTO[2];
        member[0]=new MemberDTO("id01","pwd01");
        member[1]=new MemberDTO("id02","pwd02");
        SpecSign ss = new SpecSign();
        ss.SpecSignMethod(member);

    }

    public void search(){
        SpecSearch sa = new SpecSearch();
        MemberDTO[] result = sa.specSearch();
        for(MemberDTO member : result){
            System.out.println(member.toString()+"이 조회되었습니다");
        }
        System.out.println(result.length + "만큼 조회들이 되어있습니다.");

    }
}
