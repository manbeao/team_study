public class variable_me {

    public static void main(String[] args) {
        /* 1. 변수 문제 */
        /* float를 사용하여 실수를 선언하고 정수로 전환 시켜 2를 곱한 값을 출력하시오*/

        /* 출력문 예) 3에 2를 곱한 값은 6이다 */

        float num1 = 5.0f;
        int num2 = (int) num1;
        System.out.println(num2 + "에 2를 곱한 값은 " + (num2 * 2) + "이다");
    }
}
