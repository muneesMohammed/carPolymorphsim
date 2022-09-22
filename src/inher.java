public class inher {
    String brand;
    String color;
    String modelName;
    int modelYear;
public  void enginefunction(){
        System.out.println("2000 cc");
    }
}
class car extends inher{
    public static void main(String[] args) {
        car bmw=new car();
        bmw.brand="bmw";
        bmw.color="black";
        bmw.modelName="y2";
        bmw.modelYear=2000;
        System.out.println(bmw.brand+bmw.color+bmw.modelYear);
        bmw.enginefunction();
    }

}