import java.util.Scanner;

public class practice_me {

    /*사용자가 입력한 수가 실수라면
    * 강제 자료형변환을 통해 정수로 바꾼뒤
    * 1부터 사용자가 입력한 값을 모두 더한뒤
    * 만약 그 값이 짝수라면
    * 1부터 사용자가 입력한 수까지의 홀수의 개수에 곱한뒤 사용자의 값을 곱하고
    * 홀수이면 1부터 사용자가 입력한 수까지의 짝수의 개수에 사용자가 입력한 값을 곱하시오
    *
    * 예) 원하시는 수를 입력해주세요 : 10
    *     1부터 10까지의 합인 55에 10의 짝수의 개수와 10을 곱하면 2750입니다
    *
    * */

    public void  test(){
        Scanner sc = new Scanner(System.in);
        System.out.print("원하시는 수를 입력해주세요 :");
        double num = sc.nextDouble();
        int sum =0;
        int cnt =0;
        int num1 = (int) num;

        if (num1 % 2 == 0) {

            for (int i = 1; i <= num1; i++) {
                sum++;
                cnt+=i;
        }
            System.out.println("1부터 " + num1 + "까지의 합인 "+ sum +" 에 " + num1+"까지의 " +num1+" 의 홀수의 개수에 " + sum + " 을 곱하면 " + (cnt*sum)+ "입니다");

        }else if(num1%2!=0) {
            for (int i = 1; i <= num1; i++) {
                sum++;
                cnt+=i;

            }System.out.println("1부터 " + num1 + "까지의 합인 "+ sum +" 에 "  +num1+" 의 짝수의 개수에 " + sum + "을 곱하면 " + (cnt*num1)+ "입니다");
        }
        }
    }



