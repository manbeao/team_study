import java.util.Scanner;

public class ifElseIf_ju {

    public static void main(String[] args) {
        // if-else문 문제
        /* 아이디를 입력받은 후 해당 아이디가 영문자(대소문자 모두 포함)로 시작할 경우 "사용 가능한 아이디 입니다."라는 문구가 출력되게 하시오.
         * 만약 아이디가 영문자로 시작하지 않을 경우 "영문자로 작성해주세요."라는 문제가 출력되게 하시오.*/

        // 예) sdf -> 사용 가능한 아이디 입니다.
        // 예) 12sdf -> 영문자로 작성해주세요.
        ifElseIf_ju b = new ifElseIf_ju();
        b.test2();

    }

    public void test2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("아이디를 입력해 주세요 : ");
        char id = sc.next().charAt(0);

        if(id>='A' && id<='Z'){
            System.out.println("사용 가능한 아이디 입니다.");
        } else if (id>='a' && id<='z') {
            System.out.println( "사용 가능한 아이디 입니다.");
        }
        else {
            System.out.println("영문자로 작성해주세요");
        }
    }
}
