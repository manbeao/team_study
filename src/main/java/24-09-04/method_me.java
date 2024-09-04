import java.util.Scanner;

public class method_me {
    public static void main(String[] args) {
        /* 문제1. main() 밖에서 두 수의 합에 작은값을 곱하는 메서드를 만든 뒤 main()에서 호출한다*/
        method_me app1 = new method_me();
        app1.puls(10,20);

        /* 문제2. main() 밖에서 -10부터 50까지의 난수를 생성하는 메서드를 만든 뒤 main()에서 호출한다*/
        method_me app2 = new method_me();
        app2.nansu();

        /* 문제3. main() 밖에서 스캐너로 사용자의 나이를 입력할 수 있는 메서드를 만든 뒤 main()에서 호출한다*/
        method_me app3 = new method_me();
        app3.text();
    }

    public void puls(int a, int b){
        String num1=  "두 수의 합에 " + Math.min(a, b) + "를 곱한 값은 : " + (a+b)*(Math.min(a, b));
        System.out.println(num1);
    }

    public void nansu(){
        int random = (int)(Math.random()*61)-10;
        System.out.println("난수 : " + random);
    }

    public void text(){
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자의 나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다");
    }
}
