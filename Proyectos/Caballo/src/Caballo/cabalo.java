
package Caballo;

/**
 *Nombre:Gerardo Ayala Juarez
 *Fecha:28-oct-2019
 *Tema:
 *Descripcion: cabalo
 * 
 */
public class cabalo {
//ATRIBUTO
    private int tablero[][];
    private int nf;
    private int cf;
    private int cabales=0;
//CONSTRUCTOR POR DEFECTO
    public cabalo() {
        this.tablero= new int[8][8];
        this.nf=8;
        this.cf=8;
        cabales=0;
    }
//CONSTRUCTOR
        public cabalo(int lado) {
        this.nf = lado;
        this.cf = lado;
        this.tablero= new int[cf][nf];
        
    }
//Getter y Setter
         public int getNf() {
        return nf;
    }

    public void setNf(int nf) {
        this.nf = nf;
    }

    public int getCf() {
        return cf;
    }

    public void setCf(int cf) {
        this.cf = cf;
    }

    public int getCabales() {
        return cabales;
    }

    public void setCabales(int cabales) {
        this.cabales = cabales;
    }   
//METODOS
    public int seleccion(int nc, int nf){
        if(puas(nc,nf,1,2))
            return 1;
        else if(puas(nc,nf,2,1))
            return 2;
        else if(puas(nc,nf,2,-1))
            return 3;
        else if(puas(nc,nf,1,-2))
            return 4;
        else if(puas(nc,nf,-1,2))
            return 5;
        else if(puas(nc,nf,-2,-1))
            return 6;
        else if(puas(nc,nf,-2,1))
            return 7;
        else if(puas(nc,nf,-1,2))
        return 8;
        else return-1;
    }
    public boolean puas(int nc, int nf, int x , int y){
       if(nc+x<this.cf&&nc+x>=0&&nf+y<this.nf&&nf+y>=0){
           return true;
       }
       else{
           return false;
       }
    }
    public void rosario(int nc, int nf){
        if(cabales<=nc*nf){
            switch(seleccion(nc,nf)){
            case 1:

                    this.tablero[nc+1][nf+2]=cabales;
                                        cabales+=1;
                    rosario(nc+1,nf+2);
                    break;
            case 2:
                    
                    this.tablero[nc+2][nf+1]=cabales;
                    cabales+=1;
                    rosario(nc+2,nf+1);
                    break;
            case 3:
                    
                    this.tablero[nc+2][nf-1]=cabales;
                    cabales+=1;
                    rosario(nc+2,nf-1);
                    break;
            case 4:
                    
                    this.tablero[nc+1][nf-2]=cabales;
                    cabales+=1;
                    rosario(nc+1,nf-2);
                break;
            case 5:
                    
                    this.tablero[nc-1][nf-2]=cabales;
                    cabales+=1;
                    rosario(nc-1,nf-2);
                break;
            case 6:
                    
                    this.tablero[nc-2][nf+1]=cabales;
                    cabales+=1;
                    rosario(nc-2,nf+1);
                break;
            case 7:
                    
                    this.tablero[nc-2][nf+1]=cabales;
                    cabales+=1;
                    rosario(nc-2,nf+1);
                break;
            case 8:
                    
                    this.tablero[nc+1][nf+2]=cabales;
                    cabales+=1;
                    rosario(nc-1,nf+2);
                break;
            default:
                    System.out.println("Mi Amigo Bronco.mp3");
        }
            
        }
        else{
                System.out.println("Pavido Navido.mp3");
        }
        
    }
    public void procesion(int bc, int bf){
        cabales=1;
        this.tablero[bc][bf]=cabales;
        switch(seleccion(bc,bf)){
            case 1:
                    cabales+=1;
                    rosario(bc+1,bf+2);
                    break;
            case 2:
                    cabales+=1;
                    rosario(bc+2,bf+1);
                    break;
            case 3:
                    cabales+=1;
                    rosario(bc+2,bf-1);
                    break;
            case 4:
                    cabales+=1;
                    rosario(bc+1,bf-2);
                break;
            case 5:
                    cabales+=1;
                    rosario(bc-1,bf-2);
                break;
            case 6:
                    cabales+=1;
                    rosario(bc-2,bf+1);
                break;
            case 7:
                    cabales+=1;
                    rosario(bc-2,bf+1);
                break;
            case 8:
                    cabales+=1;
                    rosario(bc-1,bf+2);
                break;
            default:
                    System.out.println("Mi Amigo Bronco.mp3");
        }
    }
    public String toString(){
        for(int i=0;i<nf;i++){
            for(int j=0;j<nf;j++){
                System.out.print(" "+this.tablero[i][j]+" ");
            }
            System.out.println();
        }
        return "Numero de rosarios = "+this.cabales;
    }
        
}
