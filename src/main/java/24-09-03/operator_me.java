public class operator_me {

    public static void main(String[] args) {
        /* 2. 연산자 문제*/
        /* 정수를 선언 후 연산자를 이용하여 5씩 증가하게 하고
         * 그 값이 20이상이면 "20 이상입니다"를 아니면
         * "20 미만 입니다"를 출력하게 하시오*/

        int num1 = 17;
        num1+=5;
        System.out.println((num1>=20)? "20 이상입니다" : "20 이하입니다");
    }
}
