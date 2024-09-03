public class variable_ju {

    public static void main(String[] args) {
        /* 음식의 가격을 정수형 변수로 선언하고, 음식의 무게를 실수형 변수로 선언하시오.
         * 그 후 음식의 무게를 정수형 변수로 형변환 시킨 후 음식의 Kg당 음식의 가격을 측정하시오.
         *
         * ex)
         * 음식의 무게 : 8.5kg
         * Kg당 가격 : 300원
         *
         * 음식의 가격 : 2400원
         * */

        int price = 2400;
        double weight = 8.5;
        int kgPrice = (int) weight;
        System.out.println("음식의 kg 당 가격은 " + (price / kgPrice) + "원 입니다");


    }
}
