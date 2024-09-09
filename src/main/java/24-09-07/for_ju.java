public class for_ju {

    /* 2단부터 9단까지 단 중 짝수번째 단만 출력하시오.
     *  즉, 2단, 4단, 6단, 8단만 출력하시오
     *
     * 예 )
     * < 2단 >
     * 2 * 1 = 2
     * 2 * 2 = 4
     * 2 * 3 = 6
     * 2 * 4 = 8
     * 2 * 5 = 10
     * 2 * 6 = 12
     * 2 * 7 = 14
     * 2 * 8 = 16
     * 2 * 9 = 18
     */

    public void test5(){
        for(int i =2; i <=9; i+=2){
            for (int j = 1; j <10; j++){
                System.out.println( i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
