public class array_class {

    private String name;
    private String location;
    private int price;

    public void Wname(String name){
        this.name = name;
    }

    public void Wlocation(String location){
        this.location=location;
    }

    public void Wprice (int price){
        if (price>0){
            this.price = price;
        }else {
            this.price =0;
        }
    }

    public String getInfo(){
        return "물의 이름은 " + this.name+ "이고 , 원산지는 " + this.location + "이며, 가격은 " +this.price+ "원 입니다";
    }

}
