public class for_ha {
    /* 1부터 100까지 합계를 구하고 결과를 출력하세요
     *
     * -- 출력 예시 --
     * 1부터 100까지의 합 : 5050
     * */
    public void test3(){
        int sum = 0;
        for (int i= 1; i<=100 ; i++){
            sum +=i;
        }
        System.out.println("1부터 100까지의 합 : " + sum);
    }
}
