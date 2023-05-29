public class Driver extends Car {

    public void drive(){
    System.out.println("You drive the car.");
    gas--;     
    status();   
    }

    public void boosters(){
    System.out.println("You drive the car.");
    gas-=3;
    status();
    }

    public void refueling(){
    System.out.println("You drive the car.");
    gas+=2;
    status();
    }

}