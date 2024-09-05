import java.util.Scanner;

public class switch_me {

    public static void main(String[] args) {
        /*문제 3.
        * 유치원 아이들의 이름과 나이를 입력하면 반이름이 출력 되게한다
        * 이때 아니들의 나이는 3살부터 7사까지이고 다른 값을 입력하면 "해당하는 반을 찾을 수 없습니다"를 출력
        *
        * 3살 : 노랑반
        * 4살 : 초록반
        * 5살 : 파랑반
        * 6살 : 분홍반
        * 7살 : 주황반
        *
        * 예) 은서의 나이는 6살이고 분홍반입니다.
        * */
        switch_me c= new switch_me();
        c.test();
    }

    public void test(){
        Scanner sc= new Scanner(System.in);
        System.out.print("아이의 이름을 입력하세요. : ");
        String name = sc.nextLine();
        System.out.print("아이의 나이를 입력하세요. : ");
        int age = sc.nextInt();

        String result = "";
        switch (age){
            case 3 :
                result = name + "의 나이는 " + age + " 살 이고 노랑반입니다" ;
                System.out.println(result);
                break;

                case 4 :
                result = name + "의 나이는 " + age + " 살 이고 초록반입니다" ;
                System.out.println(result);
                break;

                case 5 :
                result = name + "의 나이는 " + age + " 살 이고 파랑반입니다" ;
                System.out.println(result);
                break;

                case 6 :
                result = name + "의 나이는 " + age + " 살 이고 분홍반입니다" ;
                System.out.println(result);
                break;

                case 7 :
                result = name + "의 나이는 " + age + " 살 이고 주황반입니다" ;
                System.out.println(result);
                break;

            default:
                System.out.println("해당하는 반을 찾을 수 없습니다");
        }

    }
}
