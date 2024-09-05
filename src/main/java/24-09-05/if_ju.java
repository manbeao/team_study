import java.util.Scanner;

public class if_ju {
    public static void main(String[] args) {

    // if문 문제

    /* 두 수를 입력받아 양수 대소비교 하는 함수를 작성하라. 단, 입력받은 수 중 하나라도 양수가 아닐 경우 무시하는 함수를 만들어라. */

    // 예)10, 20 입력 시 -> 10과 20 중 큰 값은 20입니다.

        if_ju a = new if_ju();
        a.test1();
    }

    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 양수를 입력해 주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 양수를 입력해 주세요 : ");
        int num2 = sc.nextInt();

        if (num1>0){
            if (num1>num2){
                System.out.println( num1 + " 과 " + num2 + " 중 큰 값은 " + num1 + "입니다.");
            }else {
                System.out.println( num1 + " 과 " + num2 + " 중 큰 값은 " + num2 + "입니다.");
            }
        }else {
            System.out.println("프로그램을 종료합니다");
        }
    }
}

