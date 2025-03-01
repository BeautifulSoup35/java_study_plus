package collection;

import org.example.Main;

import java.util.Arrays;

/*
    현재까지 배운 대부분의 Java 클래스

    Scanner
    Arrays
    Integer
    Double
    Comparator
    String
    Random

      지시 사항

    배열이름은 numbers[]

    1. index가 10개인 배열을 만들고 Math.random()을 활용하여 값을 집어넣으시오.
        : 1 이상 10 이하의 int 배열로 만들어서.

    2. 값이 입력된 배열을 출력
        1) 배열 전체 출력
        2) 각 요소에 10씩 곱해서 한 줄에 출력
    3. 해당 배열의 합의 크기를 구할 것
    4. 짝수만 출력해서 합을 구할 것


    5. 배열을 오름 차순으로 정렬해서 출력
    6. 내림 차순으로 정렬해서 출력
    16:43까지 어제 낸 문제 풀이하고 있으시면 됩니다

 */
public class ArryTest03 {
    public static void main(String[] args) {
        int num =0;
        double a= Math.random();// 0.0초과 1.0미만의 난수 생성
        System.out.println(a);

        int [] numbers = new int[10];

        for(int i =0; i < numbers.length; i++){
            numbers[i] = (int )(Math.random() * 10);

        }

        System.out.println("크기 : " + numbers.length);
        System.out.print("짝수 합: ");
        for(int i =0; i < numbers.length; i++) {
            if (numbers[i] / 2 == 0) {
                num += numbers[i];
            }
        }
        System.out.println(num);

        Arrays.toString(numbers);
    }
}
