package Arrays;

public class ArrayDoble {
    static void main(String[] args) {

        int[][]mi_matriz=new int[3][5];
        mi_matriz[0][0]=5;
        mi_matriz[0][1]=10;
        mi_matriz[0][2]=15;
        mi_matriz[0][3]=20;
        mi_matriz[0][4]=25;

        mi_matriz[1][0]=30;
        mi_matriz[1][1]=35;
        mi_matriz[1][2]=40;
        mi_matriz[1][3]=45;
        mi_matriz[1][4]=50;

        mi_matriz[2][0]=55;
        mi_matriz[2][1]=60;
        mi_matriz[2][2]=65;
        mi_matriz[2][3]=70;
        mi_matriz[2][4]=75;

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){

                System.out.println(mi_matriz[i][j]);

            }
        }


    }
}
