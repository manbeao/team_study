import java.util.Scanner;

public class if_me {

    public static void main(String[] args) {
        /*문제 1. 고양이와 강아지 중 한가지 선택지를 고르게 한다음
        * cat을 입력하면 "애옹"을, 아니면 "므엉"을 출력하시오*/

        if_me a = new if_me();
        a.cat();
    }

    public void cat(){
        System.out.println("=========== 두 마리중 한마리를 고르세요 ===========");
        System.out.println("                 cat        dog                ");
        System.out.println("===============================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 선택은 : ");
        String ani = sc.nextLine();

        if (ani.equals("cat")){
            System.out.println("애옹");
        }else {
            System.out.println("므엉");
        }
    }
}
