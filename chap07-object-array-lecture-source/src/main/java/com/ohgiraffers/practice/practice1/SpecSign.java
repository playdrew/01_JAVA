package com.ohgiraffers.practice.practice1;

public class SpecSign {

    public void SpecSignMethod(MemberDTO[]member){
        System.out.println("총" + member.length + "만큼 등록되어있습니다");

        for(int i = 0 ; i< member.length;i++){
            System.out.println(member[i].getId()+"가 등록되었습니다.");
        }
    }
}
