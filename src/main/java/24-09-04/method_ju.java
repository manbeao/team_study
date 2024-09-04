public class method_ju {
    public static void main(String[] args) {

        /* 메인함수 밖에 두 수의 대소를 비교하는 함수를 작성한 후 메인 함수에서 호출하시오. */
        method_ju app1 = new method_ju();
        app1.big(30,50);
        /* 메인 함수 밖에 10부터 100까지 중 난수를 출력하는 함수를 작성한 후 메인 함수에서 호출하시오. */
        method_ju app2 = new method_ju();
        app2.nansu();

    }

    public void big(int a, int b){
        System.out.println("두수 중 큰 수는 : " +(Math.max(a,b)) + "입니다");
    }

    public void nansu(){
        int random = (int)(Math.random()*91)+10;
        System.out.println("난수 : " + random);
    }
}
