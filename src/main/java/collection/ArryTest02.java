package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class ArryTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.println(num);

        int [ ] arry01 = new int[10];
        for(int i =0 ; i < arry01.length; i++){
            arry01[i] = (i+1);
            System.out.print((i+1) + " ");
        }
        System.out.println();
        for(int arry : arry01){
            System.out.print(arry + " ");
        }


        //배열 전체 출력 방법

        System.out.println(Arrays.toString(arry01));

        Integer[] arr02 = {6, 3, 7, 1, 5, 4, 2, 8, 9, 10};
//대문자를 썼으니 클래스고 인티저안에는 모든 무언가를 넣어놓은 클래스임을 알수 있다
        //배열 정리
        Arrays.sort(arr02);
        System.out.println("오름차순" + Arrays.toString(arr02));//인덱스 번호가 달라진다
//tostring -> 특정한 애를 스트링으로 바꿔준다 스트링으로 바꿨으니 당연히 계산안됨 int -> to string -> string
        //내림차순
        Arrays.sort(arr02, Comparator.reverseOrder());

        System.out.println("내림차순"+ Arrays.toString(arr02));

        //생소한 메서드를 가지고 온다면 가독성이 떨어지는 코드가 될수있다

        //Comparaor.recerseOreder() T[] 제네릭 이라는 개념이가
        //t에 해당하는 것은 기본 자료형이 안된다, 클래스여야만 한다
//        int 가 오류나서 Interr로 교체한 이유도 그러하다
    }
}
