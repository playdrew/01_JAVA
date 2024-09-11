package com.ohgiraffers.practice.practice1;

public class SpecSign {

    public void insert(MemberDTO[]members){

        System.out.println(members.length + "만큼 등록되었습니다.");

        for(int i = 0 ; i< members.length ; i++){
            System.out.println(members[i].getId() + "가 등록되었습니다");
        }


    }

}
