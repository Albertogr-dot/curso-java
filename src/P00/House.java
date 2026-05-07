package P00;

public class House {

     private int doors;
     private int windows;
     private double size;

     public House(){

     }

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void openDoor() {
         System.out.println("La puerta está abierta");  // pongo void pq no espero un valor como respuesta
     }

     public double calculateArea(){
         return size*size;
     }


     // con esto acabo de crear una clase que tiene:

    //  -ATRIBUTOS (INT DOORS, INT WINDOWS ETC..)
    //  -METODOS (OPENDOORS,  CALCULATEAREA)
}
