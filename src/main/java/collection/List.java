package collection;
/*\
     객체와 같이
     일반변수와 다르게 데이터를 직접가지지 앟는 변수이다
     참조변수: 주소를 가지는 변수 (객체, arry) -> 데이터값을 가지고 올때 접근 방법이 독특하다
        String도 참조 변수이다
        패키명도 다 소문자인데 클랫을 대문자로 작성한것과 동일한 이유였다


 */
public class List {
    public static void main(String[] args) {
        String strExm = "hey";
        //r값 대입이 일반변수와 똑같다
        String strexm2 = new String("you");
        //객체로도 생성가능
        System.out.println(strExm);//-> 하지만 주소가 나오지 않는 클스와 다른점
        //상속이라는 개념때문에 주소가 아닌 String을 일반변수와 같이 써왔던것이다

        //로직 정의
        //equals 특정 메서드 사용시 비교 가능

        int[] arr03 = {10, 20, 30};

        System.out.println(arr03[0]);
        System.out.println(arr03[1]);
        System.out.println(arr03[2]);//요소 element

        //이상의 코드를 봤을때 sout 실행문이 반복되듯

        int[] arr04 = {10, 9, 8, 7,6, 5};

        for(int i =0; i< arr04.length; i++){
            System.out.print(arr04[i]+ " ");
        }
        System.out.println();
        for(int i = 5; i > -1 ; i--){
            System.out.print(arr04[i]+ " ");
        }

        //element들은 그 자료형에 따라 수학적인 연산 혹은 기타 다른 작업을 할 수 있습니다


    }
}
