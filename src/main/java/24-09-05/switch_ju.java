import java.util.Scanner;

public class switch_ju {

    public static void main(String[] args) {

        // if-else-if문 문제

        /* 생일을 입력하면 별자리를 알려주는 프로그램을 만들어보시오. */

        /*
        * 물병자리 1월20일 - 2월18일
          물고기자리 2월19일 - 3월20일
          양자리 3월21일 - 4월19일
          황소자리 4월20일 - 5월20일
          쌍둥이자리 5월21일 - 6월21일
          게자리 6월22일 - 7월22일
          사자자리 7월23일 - 8월22일
          처녀자리 8월23일 - 9월23일
          천칭자리 9월 24일 - 10월 22일
          전갈자리 10월 23 - 11월 22일
          사수자리 11월 23일 - 12월 24일
          염소자리 12월 25일 - 1월 19일
        * */

        // 예) 925 -> 당신의 별자리는 천칭자리입니다.

        switch_ju c= new switch_ju();
        c.test3();
    }

    public void test3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("생일을 입력해 주세요(예 12월 11일 -> 1211) : ");
        int brt = sc.nextInt();

        if(brt>=120 && brt<=218){
            System.out.print("당신의 별자리는 물병자리입니다");
        } else if (brt>=219 && brt<=320) {
            System.out.print("당신의 별자리는 물고기자리 입니다");
        }else if (brt>=321 && brt<=419) {
            System.out.println("당신의 별자리는 양자리 입니다");
        }else if (brt>=420 && brt<=520) {
            System.out.println("당신의 별자리는 황소자리 입니다");
        }else if (brt>=521 && brt<=621) {
            System.out.println("당신의 별자리는 쌍둥이자리 입니다");
        }else if (brt>=622 && brt<=722) {
            System.out.println("당신의 별자리는 게자리 입니다");
        }else if (brt>=723 && brt<=822) {
            System.out.println("당신의 별자리는 사자자리 입니다");
        }else if (brt>=823 && brt<=923) {
            System.out.println("당신의 별자리는 처녀자리 입니다");
        }else if (brt>=924 && brt<=1022) {
            System.out.println("당신의 별자리는 천칭자리 입니다");
        }else if (brt>=1023 && brt<=1122) {
            System.out.println("당신의 별자리는 전갈자리 입니다");
        }else if (brt>=1123 && brt<=1224) {
            System.out.println("당신의 별자리는 사수자리 입니다");
        }else if (brt>=1225 && brt<=119) {
            System.out.println("당신의 별자리는 염소자리 입니다");
        }else {
            System.out.println("생일을 제대로 입력하세요 ");
        }

    }
}
