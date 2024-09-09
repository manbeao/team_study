public class while_ju {

            /* 1부터 100까지의 난수를 발생시킨 후 1부터 난수까지의 합을 구하는 함수를 작성하시오.
             *
             * 예)
             * 난수 : 10
             *
             * 1부터 10까지의 합은 = 55
             * */

    public void test4 (){
        int random = (int) (Math.random() * 101)+1;
        System.out.println("발생한 난수 : " + random);
        int i =1;
        int sum = 0;
        while (i<=random){
            sum +=i;
            i++;
        }
        System.out.println("1부터 " + random + "까지의 합은 = " + sum);

    }
}
