package objects;

public class HoneAreaCalculator {
    public static void main(String[] args) {
        //create a rectangle object
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        //create another rectangle object
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRomm2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRomm2;
        System.out.println("The area of both rooms is: " + totalArea);
    }

    

    
}