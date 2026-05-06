package Arrays;

public class ForEach {
    static void main(String[] args) {

        String[]paises = new String[5];
        paises[0]="espana";
        paises[1]="brasil";
        paises[2]="francia";
        paises[3]="italia";
        paises[4]="china";

        for(String elemento:paises){
            System.out.println(elemento);
        }
    }
}
