package com.ohgiraffers.section02.copy;

public class Application1 {

    public static void main(String[] args) {

        /*title. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다.*/
        /*comment.
        *  배열의 복사에는 크게 두가지의 종류가 있다.
        *  1.얕은 복사(shallow copy) : stack 의 주소 값만 복사
        *  2.깊은 복사(deep copy) : heap 의 배열에 저장된 값 복사
        * */

        /*comment.
        *  얕은 복사란, stack 에 저장되어 있는 배열의 주소값만
        *  복사하는 것이다. 따라서 2개의 레퍼런스 변수는 동일한
        *  배열의 주소값을 가지고 있다.
        *  하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을
        *  하게 되면 다른 레퍼런스 변수로 배열에 접근했을 때도 동일한 배열을
        *  가르키고 있기 때문에 변경 된 값이 반영되고 있다.*/

        /* 노션에서 붙여넣기 붙여놓고 동기화하면 다른 곳에서도 수정이 됩니다 라는 식으로생각
        * 하면 됩니다. 공유작업이라고 생각하면 됩니다.*/

        /* 레퍼런스는 주소입니다.*/

        //Index. 1. 얕은 복사 확인을 위한 원본 배열 만들기
        int[]originArr = {1,2,3,4,5};

        // int[]originArr = {1,2,3,4,5}; 은
        // int originArr = new int[5]
        // originArr[0]=1;
        // originArr[1]=2;
        // 와 같은 것입니다.

        //Index. 2. 새로운 배열 만들어서 주소 복사하기
        int[]copyArr = originArr;
        
        // 오른쪽은 값 왼쪽은 공간

        //Index. 3. hashcode()(주민번호의 예)메소드를 사용해서 진짜로 같은지 비교
        System.out.println("원본 배열의 주소값 : " + originArr.hashCode());
        System.out.println("복제 배열의 주소값 : " + copyArr.hashCode());

        //원본 배열의 주소값예시 : 918221580
        //복제 배열의 주소값예시 : 918221580
        //stack 영역에 int[]originArr int[]copyArr 을 만들었어요. int[]originArr 은 주소인데요;
        //int[]copyArr = originArr; 주소가 복사되서 힙에서 인덱스열이 동일하게 나오는거에요
        //그래서 해쉬코드가 동일하게 되는 것이에요
        //매개변수와 전달인자할때 전달인자를 매개변수에 저장하는 것도 같은 맥락이라고 합니다.

        //Index. 4. 원본 배열과 복제 배열의 값을 반복문을 통해 출력

        for(int i = 0 ; i< originArr.length;i++){
            System.out.print(originArr[i] + " ");
        }

        System.out.println();

        for(int i = 0 ; i< copyArr.length;i++){
            System.out.print(copyArr[i] + " ");
        }

        // 값이 같으니까 같은 곳을 바라보고 있다는 것입니다.

        //Index. 5. 복제한 배열의 값을 수정하고, 원본도 반영되었는지 확인.

        copyArr[0]= 99; // 1을 99로

        System.out.println();

        for(int i = 0 ; i< originArr.length;i++){
            System.out.print(originArr[i] + " ");
        }

        System.out.println();

        for(int i = 0 ; i< copyArr.length;i++){
            System.out.print(copyArr[i] + " ");

            //99 2 3 4 5
            //99 2 3 4 5

            //copyArr만 수정했는데 origin도 바뀌었습니다. 두 변수가 같은 공간을 바라본다. 얕은 복사
        }
    }
}
