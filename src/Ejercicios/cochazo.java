package Ejercicios;

public class cochazo {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidad;

    public cochazo(String marca, String modelo, int año, int velocidad) {
        this.marca=marca;
        this.modelo=modelo;
        this.ano=ano;
        this.velocidad=0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int cantidad){
        velocidad=velocidad+cantidad;
    }

    public void frenar(int cantidad){
        velocidad=velocidad-cantidad;
    }

    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + ano + ")");
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }




}
