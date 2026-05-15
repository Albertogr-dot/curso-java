package clasesObjetos;

public class cuentaBanco {

    private String titular;
    private double saldo;

    public cuentaBanco(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double dinero){

        if(dinero>0){
            saldo=saldo+dinero;
            System.out.println("Depósito exitoso");
        }else{
            System.out.println("Número introducido incorrecto");
        }

    }

    public void retirada(double retirada){

        if(retirada>0 && retirada<saldo){
            saldo=saldo-retirada;
            System.out.println("Retirada completada");
        }else{
            System.out.println("Fondos insuficientes o número introducido erroneo");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }
}
