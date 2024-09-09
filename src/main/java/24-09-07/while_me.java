import java.util.Scanner;

public class while_me {

    public void test2(){
        /*문제 2. 1부터 사용자가 입력한 정수까지의 홀수의 개수를 구하시오
        * 예 ) 정수를 하나 입력하세요 :
        * 1부터 10까지의 홀수의 개수는 5개입니다
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                continue;
            } else if (i % 2 != 0) {
                sum++;
            }
        }  System.out.println("1부터 " + a + "까지의 홀수의 개수는" + sum + " 개 입니다");


        int i =1;
        int sum2 = 0;
        while (i<=a){
            if (a%2!=0){
                sum2 ++;
            }
            i++;
        }System.out.println("1부터 " + a + "까지의 홀수의 개수는" + sum2 + " 개 입니다");

    }
}
