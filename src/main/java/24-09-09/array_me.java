public class array_me {
    /*문제. 편의점에서 판매 되고있는 물의 정보를 클래스로 만들려고한다.
    * 물의 이름, 원산지, 가격(int)의 값을 받아올것이다.
    * 단, 물의 이름과 원산지, 가격에는 직접 접근할수없게 하고 가격은 음수일시에 0으로 초기화 시켜라
    *
    * 입력할 값 - 이름 : 동원샘물, 아이시스, 삼다수
    *         - 원산지 : 경기도 연천군, 충북 청주, 제주도
    *         - 가격 : 400원, 500원, 700원
    *  */

    public static void main(String[] args) {

        array_class array1 = new array_class();
        String arrName[] = {"동원샘물", "아이시스", "삼다수"};
        String arrLoaction[] = {"경기도 연천군","충북 경주", "제주도"};
        int arrprice[]={400,500,700};
        for (int i = 0;i<arrName.length; i++){
            array1.Wname(arrName[i]);
            array1.Wlocation(arrLoaction[i]);
            array1.Wprice(arrprice[i]);
            System.out.println(array1.getInfo());
        }





    }




}
