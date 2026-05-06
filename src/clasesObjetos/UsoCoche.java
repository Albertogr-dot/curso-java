package clasesObjetos;

public class UsoCoche {
    static void main(String[] args) {

        coche ferrari = new coche();



        ferrari.frenar();
        ferrari.arrancar();
        ferrari.girar();

        coche audi = new coche();

        ferrari.setRuedas(4);

        audi.frenar();
        audi.arrancar();
        audi.girar();

    }
}
