package com.ohgiraffers.section06.singleton;

import com.ohgiraffers.section03.dto.MemberDTO;

public class Application {

    public static void main(String[] args) {

        /*title. 싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다*/

        /*comment.
        *   싱글톤 패턴이란
        *   어플리케이션이 시작될 때 어떠한 클래스가 최초 한 번만
        *   메모리를 할당하고 그 메모리에 인스턴스를 만들어서
        *   하나의 인스턴스를 공유해서 메모리 낭비를 방지 할 수 있게
        *   한다. (즉, 매번 new 키워드를 사용해서 인스턴스를 생성하지 않는다.
        *   장점
        *   - 첫 번째 이용 시에는 인스턴스를 생성해야 하기 때문에 속도 차이가
        *   - 나지만, 두 번째 이용시에는 인스턴스 생성 시간 없이 사용 가능
        *   - 인스턴스가 절대적으로 한 개만 존재하는 것을 보장할 수 없다.
        *   단점
        *   - 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면
        *   - 결합도가 높아진다 (결합도가 높아지는 것 -> 한 곳 수정 시 다른 곳도 수정 필요)
        *   - 동시성 문제를 고려해야 하기 때문에 난이도가 있다. (에어콘 온도 21도 23도를 원하는 사람들의 충돌 ) 
        * */

        /*comment.
        *   싱글톤 구현 방법
        *   -1. 이른 초기화(Eager)
        *   -2. 게으른 초기화(Lazy)
        *  */
        
        /*Index. 1. 이른 초기화 구현 */
        
        //new 라는 키워드를 쓰지 못하게 막고 싶은 것  EagerSingleton();뒤에 이 부분은 생성자입니다.
        //그럼 외부에서 쓸 수 없게 만드는 것 접근제한자
        //기본생성자를 private 로 막을 거에요
        //그럼 아래방식대로 호출을 못해요
        //그래야 인스턴스가 절대적으로 하나만 있는 것을 보장함
        //EagerSingleton(); 뒤에 부분 빨간 밑줄됨 private 생성자라서 외부에서 사용할 수 없음
        //기본 생성자가 private 이기 때문에 인스턴스를 생성할 수 없다.
        //EagerSingleton eagerSingleton = new EagerSingleton();
        
        //싱글톤 객체의 가장 중요한 것중하나가 같은 인스턴스를 공유한다는 것입니다
        //아무리 다른 변수에 담더라도 eager1 2는 동일해야 합니다.
        //동일한시 확인하기 위해 해쉬코드 출력같음을 통해 한개의 인스턴스를 공유함을 알수있음
        //싱글톤은 생성자를 통한 매개변수로도 사용하지 않는게 적합합니다. 그래야 하나의 인스턴스로만 공유할수있으니까요

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1.hashCode() = " + eager1.hashCode());
        System.out.println("eager2.hashCode() = " + eager2.hashCode());
        
        /*Index. 2. 게으른 초기화 구현*/
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1.hashCode() = " + lazy1.hashCode());
        System.out.println("lazy2.hashCode() = " + lazy2.hashCode());

        /*comment.
        *   이른 초기화는 클래스를 로드하는 속도는 느리지만,
        *   처음 인스턴스 반환하는 속도가 빠르다는 장점이 있다.
        *   게으른 초기화는 클래스 로드하는 속도는 빠르지만,
        *   메소드를 통해 인스턴스를 생성하고 넘기기 때문에
        *   첫 번째 요청의 속도가 느리다는 특징을 가지고 있다.
        * */

    }
}

//new 라는 키워드를 객체를 만들건데 해당하는 객체를 공유하게 만들어요
//MemberDTO member = new MemberDTO();
//MemberDTO member2 = new MemberDTO(); 이렇게 여러 new 키워드를 통해 힙에 공간을 할당해야 할 필요없게 하는 것
//static 은 목적이 분명해야 좋은 것 코드가 문제발생하거나 더 나은 코드를 만들기 위해 static 을 사용하는 것입니다.

//int x;
//x=10; 게으른초기화 : 값이 필요한때 값을 넣음
//int y = 10; 이른초기화 : 공간을 만들자 말자 값을 집어넣음