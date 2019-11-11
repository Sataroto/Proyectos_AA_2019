
package TSP_Dinamico;
/**
 *Nombre:Gerardo Ayala Juarez
 *Fecha:07-nov-2019
 *Tema:
 *Descripcion: Test
 * 
 */
public class Test {

    public static void main(String[] args) {
    int[][] hola= new int[10][10];
    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            hola[i][j]=0;
        }
    }
    
    hola[1][0]=hola[0][1]=13;
    hola[2][0]=hola[0][2]=33;
    hola[3][0]=hola[0][3]=28;
    hola[4][0]=hola[0][4]=37;
    hola[5][0]=hola[0][5]=7;
    hola[6][0]=hola[0][6]=32;
    hola[7][0]=hola[0][7]=40;
    hola[8][0]=hola[0][8]=80;
    hola[9][0]=hola[0][9]=26;
    //
    hola[2][1]=hola[1][2]=39;
    hola[3][1]=hola[1][3]=83;
    hola[4][1]=hola[1][4]=50;
    hola[5][1]=hola[1][5]=68;
    hola[6][1]=hola[1][6]=16;
    hola[7][1]=hola[1][7]=98;
    hola[8][1]=hola[1][8]=81;
    hola[9][1]=hola[1][9]=55;
    //
    hola[3][2]=hola[2][3]=80;
    hola[4][2]=hola[2][4]=88;
    hola[5][2]=hola[2][5]=49;
    hola[6][2]=hola[2][6]=53;
    hola[7][2]=hola[2][7]=75;
    hola[8][2]=hola[2][8]=63;
    hola[9][2]=hola[2][9]=55;
    //
    hola[4][3]=hola[3][4]=94;
    hola[5][3]=hola[3][5]=4;
    hola[6][3]=hola[3][6]=20;
    hola[7][3]=hola[3][7]=6;
    hola[8][3]=hola[3][8]=59;
    hola[9][3]=hola[3][9]=76;
    //
    hola[5][4]=hola[4][5]=81;
    hola[6][4]=hola[4][6]=87;
    hola[7][4]=hola[4][7]=85;
    hola[8][4]=hola[4][8]=4;
    hola[9][4]=hola[4][9]=19;
    //
    hola[6][5]=hola[5][6]=96;
    hola[7][5]=hola[5][7]=53;
    hola[8][5]=hola[5][8]=40;
    hola[9][5]=hola[5][9]=37;
    //
    hola[7][6]=hola[6][7]=80;
    hola[8][6]=hola[6][8]=57;
    hola[9][6]=hola[6][9]=68;
    //
    hola[8][7]=hola[7][8]=65;
    hola[9][7]=hola[7][9]=41;
    //
    hola[9][8]=hola[8][9]=97;
    
    
//    TSP_bruto[] camino = new TSP_bruto[10];
//    for (int i=0;i<10;i++){
//        camino[i]=new TSP_bruto(i,hola.clone());
//    }
    
        TSP_Dinamico[] cucu = new TSP_Dinamico[10];
        int caminos=1000;
        String ojala="";
        for (int i=0;i<10;i++){
        cucu[i]=new TSP_Dinamico(i,hola.clone(),caminos,ojala);
        caminos=cucu[i].getCamino();
        ojala=cucu[i].getSentencia();
        
    }
    
    }

}
