public class operator_ju {

    public static void main(String[] args) {
        /* 1. 변수에 3이란 값을 대입한 후 36이란 값이 출력되는 연산식을 작성하시오. */

        int num = 3;
        System.out.println("값은 : " + num * 12);

        /* 2. 증감연산자를 사용하여 3을 대입한 변수가 16가 되게끔 연산식을 작성하시오 */
        int num1 = 3;
        int number = ++num1 * 4 ;   //1이 먼저 증가하여 4가 되고 거기에 4를 곱함
        System.out.println("변수의 값은 : " + number);

        /* 3. 변수의 값이 대/소문자와 영문자인지를 구분하는 식을 작성하시오.
         *
         * 예) c는 소문자입니다.
         *     X는 대문자입니다.
         *     ㄹ는 영문자가 아닙니다.
         */
        char small = 'c';   //int는 정수로 나타내기대문에 유니코드로 답이 반환되고 char는 문자로 나타내기때문에 c가 그대로 반환된다
        char big = 'X';
        char korean = 'ㄹ';

        System.out.println((97<=small && 122>= small)? small+"은 소문자입니다" :
                (65<=small && 90>=small)? small + "은 대문자 입니다" :
                small +"은 영문자가 아닙니다");
    }
}
