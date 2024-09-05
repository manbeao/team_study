import java.util.Scanner;

public class swtich2_ju {

    public static void main(String[] args) {
        // switch문 문제

        /* 달을 입력하면 계절을 알려주는 프로그램을 만들어보시오. */
        //예) 달을 입력하세요 : 1
        //    입력하신 1월은 겨울 입니다.
        //    달을 입력하세요 : 13
        //    해당하는 달이 존재하지 않습니다.
        swtich2_ju d= new swtich2_ju();
        d.test4();
    }

    public void test4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("달을 입력하세요 : ");
        int dal = sc.nextInt();

        switch (dal){
            case 1 :
                System.out.println("입력하신 " + dal + " 월은 겨울 입니다");
                break;

            case 2 :
                System.out.println("입력하신 " + dal + " 월은 겨울 입니다");
                break;

            case 3 :
                System.out.println("입력하신 " + dal + " 월은 봄 입니다");
                break;

            case 4 :
                System.out.println("입력하신 " + dal + " 월은 봄 입니다");
                break;

            case 5 :
                System.out.println("입력하신 " + dal + " 월은 봄 입니다");
                break;

            case 6 :
                System.out.println("입력하신 " + dal + " 월은 여름 입니다");
                break;

            case 7 :
                System.out.println("입력하신 " + dal + " 월은 여름 입니다");
                break;

            case 8 :
                System.out.println("입력하신 " + dal + " 월은 여름 입니다");
                break;

            case 9 :
                System.out.println("입력하신 " + dal + " 월은 가을 입니다");
                break;

            case 10 :
                System.out.println("입력하신 " + dal + " 월은 가을 입니다");
                break;

            case 11 :
                System.out.println("입력하신 " + dal + " 월은 가을 입니다");
                break;

            case 12 :
                System.out.println("입력하신 " + dal + " 월은 겨울 입니다");
                break;
        }

    }
}
