#include<stdio.h>
#include<stdlib.h>
int main(){
    int situ=0;
    int h =0;
    int cont;
    int conte=0;
    int hashcode=0;
    char cadena[500];
    char empate[500];
    printf("Ingrese la cadena donde se va a buscar la cadena \n");
    scanf("%s",&cadena);
    for(int i =0; i<500;i++){
        
        if(cadena[i] =='\0'){
            cont=i;
            break;
        }
    }
    printf("Ingrese la cadena que se va a buscar la cadena \n");
    scanf("%s",&empate);
    for(int i =0; i<500;i++){
        if(empate[i]=='\0'){
            conte=i;
            break;
        }
    }
    for(int i =0; i<conte;i++){
        hashcode+=empate[i]+i;
    }

    for(int i=0;i<cont-conte+1;i++){
        for(int j=0;j<conte;j++){
        h=h+cadena[i+j]+j;
        }
        if(h==hashcode){
            situ++;
        }
        h=0;
    }

    printf("El numero de empate es %i",situ);

return 0;


}