package collection;

import org.example.Main;

import java.util.Arrays;

/*
    다차원 배열

    많이 타고 들어갈때 다양한 타입을쓸때에는 JSON을 쓰지 굳이 3차원 이상을 쓰진 않는다
    행 가로 열 세로
    1 2 3 git push -u origin main
    4 5 6
    7 8 9
          1행        2행          3행
        {1, 2, 3}. {4, 5, 6}, {7, 8, 9}
        행, 열 Y축 먼저 읽는다
        [0][0] → 1
        [0][1] → 2
 */
public class ArryTest04 {
    public static void main(String[] args) {
        int[][] arr03 = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println(arr03);
        System.out.println(Arrays.toString(arr03));
        //int와 int[] 다른 데이터 타입이다
        for(int[] elemental : arr03) {
        for (int element : elemental) {
            System.out.println(element);
        }
        System.out.println();
}


//        for(int i =0; i < arr03.length; i++){
////            System.out.println(arr03[i]);
//            for(int j = 0; j < arr03[i].length; j++){
//                System.out.println(arr03[i][j]);
//            }
        }
    }

