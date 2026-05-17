package Herencia;

public class coche extends Vehiculo{

    private boolean tieneSidecar;

    public void haceCaballito(){
        System.out.println("La moto está haciendo un caballito");
    }

    public coche(String marca, String color, int ruedas, boolean tieneSidecar) {
        super(marca, color, ruedas);
        this.tieneSidecar = tieneSidecar;
    }

    /*public void haceCaballito(){
        System.out.println("La moto está haciendo un caballito");
    }*/

    @Override
    public String toString() {
        return "coche{" +
                "tieneSidecar=" + tieneSidecar +
                '}' + super.toString();
    }
}

