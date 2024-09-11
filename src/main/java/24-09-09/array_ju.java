import java.util.Scanner;

public class array_ju {

        public static void main(String[] args) {

            /* 사용자에게 정수 3개를 입력받은 값으로 배열을 만든 후 해당 배열의 값보다 2배의 값을 같은 또다른 배열을 하나 생성하시오.
             *  예) "첫 번째 인덱스의 값을 입력하세요 :  10
             *      "두 번째 인덱스의 값을 입력하세요 :  20
             *      "세 번째 인덱스의 값을 입력하세요 :  30
             *
             *  출력 : numArr의 배열은 : { 10 20 30 }
             *        numArr2의 배열은 : { 20 40 60 }
             */

            Scanner sc = new Scanner(System.in);
            System.out.print("첫번째 정수를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 정수를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("세번째 정수를 입력하세요 : ");
            int num3 = sc.nextInt();

            int[] arr1={num1,num2,num3};
            int sum =0;
            for (int i=0; i<arr1.length; i++){
                sum = arr1[i];
            }
            System.out.println("NumArr의 배열은  : {" + arr1[0] + " " +arr1[1]+ " " +arr1[2]+ " } ");
        }

    }
