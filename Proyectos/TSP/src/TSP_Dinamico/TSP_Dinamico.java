
package TSP_Dinamico;

/**
 *Nombre:Gerardo Ayala Juarez
 *Fecha:05-nov-2019
 *Tema: 
 *Descripcion: TSP_Dinamico
 * 
 */
public class TSP_Dinamico                                                                                                                      {
    int[][] array;
    boolean[] lista={false, false, false, false, false, false, false, false, false, false};
    String Sentencia="";
    String[] ciudades={"A","B","C","D","E","F","G","H","I","J"};
    int ultimo=0;
    int camino=0;
    int inicio=0;
    public TSP_Dinamico(int inicio, int[][] array){
        this.array=array;
        this.inicio=inicio;
        int siguiente=inicio;
        int previo;
        this.lista[inicio]=true;
        Sentencia=ciudades[inicio];
        while(!(lista[0]&&lista[1]&&lista[2]&&lista[3]&&lista[4]&&lista[5]&&lista[6]&&lista[7]&&lista[8]&&lista[9])){
            for(int x=0;x<10;x++){
                    if(!lista[x]){
                        previo=siguiente;
                        siguiente=Menor( siguiente);
                        lista[siguiente]=true;
                        camino+=array[previo][siguiente];
                        Sentencia=Sentencia+"-"+ciudades[siguiente];
                }
            }
            System.out.println();
        }
        ultimo = siguiente;
        System.out.println("El camino es: "+Sentencia+"-"+ciudades[inicio]);
        System.out.println("El camino de pasos es: "+ camino+array[siguiente][inicio]);
    
    
       }
    public TSP_Dinamico(int inicio, int[][] array,int camino_corto, String sentencia_corta){
        this.array=array;
        int aux=0;
        this.inicio=inicio;
        int siguiente=inicio;
        int previo;
        this.lista[inicio]=true;
int indice_inicio=0;
        Sentencia=Sentencia+ciudades[inicio]+"-";
        while(!(lista[0]&&lista[1]&&lista[2]&&lista[3]&&lista[4]&&lista[5]&&lista[6]&&lista[7]&&lista[8]&&lista[9])){
            for(int x=0;x<10;x++){
                    if(!lista[x]){
                        previo=siguiente;
                        siguiente=Menor(siguiente);
                        lista[siguiente]=true;
                        camino+=array[previo][siguiente];
                        if(camino>camino_corto){
                            Sentencia = ciudades[inicio];
                            String pasos[]=sentencia_corta.split("-");
                            for(int i =0 ; i<10 ; i++){
                                if(pasos[i].equals(ciudades[inicio])){
                                    indice_inicio=i;
                                    break; 
                               }
                           
                            }
                            for(int i=0;i<10;i++){
                                if((i+indice_inicio)<10){
                                    lista[i+indice_inicio]=true;
                                    Sentencia+="-"+ciudades[i+indice_inicio];
                                    aux++;
                                }
                                else{
                                    lista[i-aux]=true;
                                    Sentencia+="-"+ciudades[i-aux];
                                }
                                
                                
                               if(i==9){
                                   if((i+indice_inicio)>10){
                                    siguiente=(i-aux);
                                }
                                else{
                                    siguiente=(i+indice_inicio);
                                    
                                }
                               }
                                    
                            }
                            aux=0;
                           this.camino=camino_corto;
                            break;
                        }
                        else
                        Sentencia=Sentencia+ciudades[siguiente]+"-";
                        
                }
            }
        }
        
        ultimo=siguiente;
        camino=camino+array[ultimo][inicio];
        
        if(camino>camino_corto){
            camino=camino_corto;
            Sentencia = ciudades[inicio];
                            String pasos[]=sentencia_corta.split("-");
                            for(int i =0 ; i<10 ; i++){
                                if(pasos[i].equals(ciudades[inicio])){
                                    indice_inicio=i;
                                    break; 
                               }
                           
                            }
                            for(int i=0;i<10;i++){
                                if((i+indice_inicio)<10){
                                    lista[i+indice_inicio]=true;
                                    Sentencia+="-"+ciudades[i+indice_inicio];
                                    aux++;
                                }
                                else{
                                    lista[i-aux]=true;
                                    Sentencia+="-"+ciudades[i-aux];
                                }
                                
                                
                               if(i==9){
                                   if((i+indice_inicio)>10){
                                    siguiente=(i-aux);
                                }
                                else{
                                    siguiente=(i+indice_inicio);
                                    
                                }
                               }
                                    
                            }
                            aux=0;
                           this.camino=camino_corto;
        }
        System.out.println("El camino es: "+Sentencia+"-"+ciudades[inicio]);
        System.out.println("El camino de pasos es: "+camino);
    
    
       }
    public int Menor( int fila){
        int indicemenor=0;
        int numeromenor=1000;
        for(int i=0; i<10;i++)
        {
            if(fila != i){
                if(!lista[i]){
                    if(array[fila][i]<numeromenor){
                        indicemenor=i;
                        numeromenor=array[fila][i];
                        }
                    }
            }
        }
        return indicemenor;
    }

    public String getSentencia() {
        return Sentencia;
    }

    public void setSentencia(String Sentencia) {
        this.Sentencia = Sentencia;
    }

    public int getCamino() {
        return camino;
    }

    public void setCamino(int camino) {
        this.camino = camino;
    }
    public int pasosCompleto(){
        return camino+array[ultimo][inicio];
    }
    public String CaminoCompleto(){
        return Sentencia+"-"+ciudades[inicio];
    }
    
}
