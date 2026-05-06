package P00;

public class HouseMain {
    static void main(String[] args) {

        House my_house=new House();

        my_house.setDoors(2);
        my_house.setWindows(4);
        my_house.setSize(10);

        House my_house2=new House();

        my_house2.setDoors(6);
        my_house2.setWindows(8);
        my_house2.setSize(20);

        System.out.println("La cantidad de puertas es " + my_house.getDoors());
        System.out.println("La cantidad de ventanas es " + my_house.getWindows());
        my_house.openDoor();

        double area=my_house.calculateArea();
        System.out.println("El area de la casa es " + my_house.calculateArea());

    }
}
