package cl.lec;
public class ProyectoRama {
    //Leonardo
    public static void mostrarPuntos(int puntos[]){
        
    }
    //Wilgen
    public static void buscarPunto(int puntos[],int buscar){
        
    }
    //Constanza
    public static void puntosMayores50(int puntos[]){
        int i;
        for(i = 0 ; i < puntos.length ; i++){
	if(puntos[i] > 50) {
          System.out.print(puntos[i] + " ");
          }
        }
    }
    //Alejandro
    public static void puntosMenoresIguales50(){
        
    }
    //Maria
    public static float promedioPuntos(int puntos[]){ 
        int suma = 0;  
        for (int i = 0; i < puntos.length; i++) {
            suma+= puntos[i];
        }   
        return suma/puntos.length;
    }
    
    //Keshny
    public static void mostrarPuntosInverso(int puntos[]){
        
    }
    public static void main(String[] args) {
        int puntos[] = {10,20,30,40,50,60,70,80,90,100};
    }
}
