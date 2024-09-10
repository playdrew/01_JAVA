package com.ohgiraffers.section02.use;

public class MemberManager {
    
    /*comment.
    *   사용자에게 1(회원등록), 2(회원조회)번 요청을 받게 되면
    *   1. 등록 관련 클래스에게 명령
    *   2. 조회 관련 클래스에게 명령
    * */

    public void singUpMember(){
        //5명의 회원정보를 info 직원에게 전달 그럼 info 직원은 등록을 할 것입니다. info 직원은 등록할줄 모르고 등록을 잘하는 녀석에게 보내요
        MemberDTO[] members = new MemberDTO[5];
        members[0]=new MemberDTO(1,"user01","pass01","푸바오",4,'여');
        members[1]=new MemberDTO(2,"user02","pass02","아이바오",7,'여');
        members[2]=new MemberDTO(3,"user03","pass03","러바오",7,'남');
        members[3]=new MemberDTO(4,"user04","pass04","후이바오",1,'여');
        members[4]=new MemberDTO(5,"user05","pass05","루이바오",1,'여');

        //회원 등록에 특화된 직원
        MemberInsertManager insertManager = new MemberInsertManager();
        insertManager.insert(members); // 회원등록에 특화된 직원에게 넣어달라고 요청
    }

    public void searchAllMember() {

        MemberSearchManager searchManager = new MemberSearchManager();
        MemberDTO[] result = searchManager.searchAllMembers();
        System.out.println("========================가입 된 푸바오 패밀리========================");
        for(MemberDTO member : result){
            System.out.println(member.toString());
        } // result 값을 memberDTO member 에 대입한다. 향상된 for 문 : 세미콜론 오른쪽을 왼쪽에 대입한다.
        System.out.println("==================================================================");
        System.out.println("총 " + result.length + "명의 회원이 가입되어 있습니다!!!");

    }
}

// 1번 아니면 2번 아니면 9번 누를꺼야
// 백화점에 INFO 가 있는데 화장실 어디 화장실청소안됨 질문 INFO 직원은 본인이 가서 청소할까요 청소관리직원에게 전화를 걸어서
// 직원님 청소좀 해주세요 이런 계층을 만들거에요 멤버메니저는 최고관리자고요.
// 왜 계층을 만들까요 알아보기 쉽게 해석하기 쉽게 유지보수에 용이하도록
