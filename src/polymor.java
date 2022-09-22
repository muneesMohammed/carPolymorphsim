public class polymor {
    String brand;
    String color;
    String modelName;
    int modelYear;
    public  void enginefunction(){
        System.out.println("2000 cc");
    }
}
class benz extends inher{

    public  void enginefunction(){
        System.out.println("2100 cc");
    }

}
class bmw extends inher{

    public  void enginefunction(){
        System.out.println("2200 cc");
    }

}
class main extends inher{

    public static void main(String[] args) {
        inher ob1= new inher();
        ob1.enginefunction();
        inher ob3=new benz();
        ob3.enginefunction();
        bmw ob=new bmw();
        ob.enginefunction();
    }

}
