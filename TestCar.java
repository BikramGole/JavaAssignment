class Car{
    String Color;
    void drive(){
        System.out.println(Color + " Car is drving");
    }
}

public class TestCar{
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.Color= "Red";
        myCar.drive();
    }
}
