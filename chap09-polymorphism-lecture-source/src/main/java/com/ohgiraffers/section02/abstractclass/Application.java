package com.ohgiraffers.section02.abstractclass;

public class Application {

    public static void main(String[] args) {

        /*title. 추상 클래스와 추상 메소드를 이해할 수 있다.*/
        
        /*comment.
        *   추상클래스와 추상메소드
        *   추상메소드를 0개 이상 가지고 있는 클래스를 추상클래스라고 한다.
        *   추상 클래스는 클래스 선언부에 abstract 라고 명시 해야 한다.
        *   추상클래스는 클래스 인 척 하는 녀석이기 때문에
        *   직접적으로 인스턴스를 생성할 수 없다.
        *   그렇기 때문에 추상클래스를 사용하기 위해서는 상속 받은
        *   자식클래스를 이용해서 인스턴스를 생성해야 한다.
        * */

        /*Index. 1. 추상클래스는 인스턴스를 생성할 수 없다.*/

        //Product product = new Product(); // Product product = new Product(); 에서  new Product(); 가 인스턴스를 만들수 없다고 떠요 cannot be instantiated

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone); // true
        //스마트폰이면서 제품도 맞는지 확인을 해봐요
        System.out.println(smartPhone instanceof Product); // true

        //Product 는 직접적으로 인스턴스를 만들 수 없기 때문에
        /*Index. 2. 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용*/
        Product product = (Product) new SmartPhone();
        
        /*Index. 3. 동적 바인딩을 통해 자료형은 Product 지만 smartPhone 의 메소드가 호출됨 */
        product.abstMethod();

        /*Index. 4. 추상클래스가 가진 메소드도 호출할 수 있다*/
        product.nonStaticMethod();

        /*스태틱 메소드는 인스턴스 생성이 불필요*/
        Product.staticMethod();

        /*comment.
        *   추상클래스를 왜 쓰냐?
        *   추상메소드를 오버라이딩하는 것에 강제성이 부여
        *   따라서 여러 클래스를 그룹화 하여
        *   필수 기능을 정의해서 강제성을 부여해 개발 시
        *   일관된 인터페이스를 정의할 수 있게 된다.
        * */


        

    }

}
