package collection;

import java.util.Scanner;

/*
    String[] names 배열을 선언하고
    출석부에 이름을 입력하여 names 배열에 집어넣는 프로그램을 작성합니다.

    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 10
    1 번 학생 이름 : 김민채
    2 번 학생 이름 : 김태윤
    3 번 학생 이름 : 류유민
    4 번 학생 이름 : 박동준
    5 번 학생 이름 : 안민섭
    6 번 학생 이름 : 엄희재
    7 번 학생 이름 : 이현규
    8 번 학생 이름 : 정민규
    9 번 학생 이름 : 제다정
    10 번 학생 이름 : 최민준

    [ 출력 결과 ]
    1. 김민채
    2. 김태윤
    3. 류유민
    4. 박동준
    5. 안민섭
    6. 엄희재
    7. 이현규
    8. 정민규
    9. 제다정
    10. 최민준
 */
public class ArryTest01 {

//    String[] strArray01 = {"이런", "식으로", "적을 수 ", "있습니다"};


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String name;

        System.out.print("number: ");
        num = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[num];
        for(int i = 0; i <num ; i++){
            System.out.print(i+1 + "student name : ");
            name =scanner.nextLine();
//            scanner.nextInt();
             names[i] =name;

//            System.out.println();
        }
        System.out.println("출력결과");
        for(int i = 0; i < names.length; i++){
            System.out.println(i+1+ names[i]);
        }

    }


}
