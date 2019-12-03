
package Caballo;

/**
 *Nombre:Gerardo Ayala Juarez
 *Fecha:27-oct-2019
 *Tema:
 *Descripcion: Caballo
 * 
 */
    public class Caballo {
    //ATRIBUTOS
    private final int numF;
    private final int numC;
    private final int[][] tablero;
    private int     cmov;
    //CONSTRUCTOR POR DEFECTO
    public Caballo(){
        cmov =0;
        numF = 8;
        numC = 8;
        tablero     = new int[8][8];
    }
    //CONSTRUCTOR
    public Caballo(int n) {
        cmov =0;
        numF = n;
        numC = n;
        tablero     = new int[n][n];
    }
    //Getter y Setter

    public int getCmov() {
        return cmov;
    }

    public void setCmov(int cmov) {
        this.cmov = cmov;
    }

    public int getNumF() {
        return numF;
    }

    public int getNumC() {
        return numC;
    }

    public int[][] getTablero() {
        return tablero;
    }
 
 //METODOS
     public boolean resolverProblema(int f, int c) {
            cmov++;
            tablero[f][c] =cmov;
            //Caso elemental
            if(cmov==numF*numC) return true;
            //Caso exacto
            int[][] posibles = PosiblesCasillas(f, c); //busco los movimientos posibles de mi posicion
            if (posibles.length != 0 ){
                PosiblesMovimientos(posibles);        // Ordeno los datos por el menor num de movimiento de la siguiente posicion
                if (resolverProblema(posibles[0][0], posibles[0][1])) { // si la siguiente casilla tiene solucion, ese camino es una solucion
                    return true;
                }
            }

            return false;
     }

 
    void PosiblesMovimientos(int[][] movimientos) {
        for(int i=0; i<movimientos.length; i++) {
            for(int j=i+1; j<movimientos.length; j++) {
                int cuantosPosiblesI = PosiblesCasillas(movimientos[i][0], movimientos[i][1]).length;
                int cuantosPosiblesJ = PosiblesCasillas(movimientos[j][0], movimientos[j][1]).length;
                if(cuantosPosiblesJ<cuantosPosiblesI) { //Orden por los menores movimientos posibles de la sig posición. (Aqui esta la heuristica dada)
                    int tmp0 = movimientos[i][0];
                    movimientos[i][0] = movimientos[j][0];
                    movimientos[j][0] = tmp0;
                    int tmp1 = movimientos[i][1];
                    movimientos[i][1] = movimientos[j][1];
                    movimientos[j][1] = tmp1;
                }
            }
        }
    }

    int[][] PosiblesCasillas(int x, int y) {
        int[][] resp = new int[8][2];
        int     aux  = 0;
        if(esValido(x-2,y-1)){ 
            resp[aux][0]=x-2; resp[aux++][1]=y-1; 
        }
        if(esValido(x-2,y+1)){
            resp[aux][0]=x-2; resp[aux++][1]=y+1; 
        }
        if(esValido(x-1,y-2)){ 
            resp[aux][0]=x-1; resp[aux++][1]=y-2; 
        }
        if(esValido(x-1,y+2)){
            resp[aux][0]=x-1; resp[aux++][1]=y+2;
        }
        if(esValido(x+2,y-1)){
            resp[aux][0]=x+2; resp[aux++][1]=y-1; 
        }
        if(esValido(x+2,y+1)){
            resp[aux][0]=x+2; resp[aux++][1]=y+1;
        }
        if(esValido(x+1,y-2)){
            resp[aux][0]=x+1; resp[aux++][1]=y-2;
        }
        if(esValido(x+1,y+2)){
            resp[aux][0]=x+1; resp[aux++][1]=y+2; 
        
        }
        int[][] tmp = new int[aux][2];
        for(int i=0; i<aux; i++) { 
            tmp[i][0] = resp[i][0]; tmp[i][1]=resp[i][1]; 
        }
        return tmp;
    }
 
    boolean esValido(int f, int c) {
               return !(f<0 || f>numF-1 || c<0 || c>numC-1||tablero[f][c]!=0);
    }
    //METODOS Sobreescritos
    @Override
    public String toString() {
        for (int[] fila : tablero) {
            for (int j = 0; j < fila.length; j++) {
                System.out.printf("|%d|", fila[j]);
            }
            System.out.println();
            for (int j = 0; j < fila.length; j++) {
                System.out.print("----");
            }
            System.out.println();
        }
        
        if(cmov== this.getNumF()*this.getNumC()){
            return "Logrado";
        }
        else
            return "Hay un problema";
    }
    }





