import java.util.Scanner;

public class practice_ju2 {

    /* 두 정수를 입력받고 입력받은 두 정수를 매개변수로 받는 삼항연산자 함수를 작성하시오.
     *  또한 두 정수가 같으면 두 수를 곱하고, 두 정수가 다르면 더하는 값을 리턴값으로 갖는 함수를 작성하시고
     *  static함수로 작성하여 호출하시오.
     *
     *
     * 예 ) 첫 번째 정수를 입력하세요 : 10
     *      두 번째 정수를 입력하세요 : 10
     *
     * 출력 : 두 수의 곱은 : 100
     * */

    public static String test3(){
    Scanner sc= new Scanner(System.in);
    System.out.print("첫 번째 정수를 입력하세요 : ");
    int num1 = sc.nextInt();

    System.out.print("두 번째 정수를 입력하세요 : ");
    int num2 = sc.nextInt();

    return  (num1 == num2)?"두 수의 곱은 : " + (num1*num2):"두 수의 합은 : " + (num1+num2);



}

    public static String Number(int num1,int num2){
       return  (num1 == num2)?"두 수의 곱은 : " + (num1*num2):"두 수의 합은 : " + (num1+num2);
    }



    }
