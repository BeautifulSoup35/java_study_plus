package collection;

public class EnhancedFor {
    /*
    향상된 for문

    insdex 넘버 사용없이 for문 반복

    읽기만 가능 쓰기 불가능

    for(자료형 변수형 :  배열)\

    이때 변수의 자료형은 배열의 자료와 같다
    자료형은 복수 형태로 작성을 한다
     */

    public static void main(String[] args) {
        String[] names = {"김일", "김이"};

        for(String name : names){
            System.out.println(name);
        }

    }
}
