/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Enviar;
public class Enviar {

    public static void main(String[] args) {
        System.out.println("""
                           Bienvenido a la calculadora""");
        int x = 32;/*numero que quieres dividir*/ 
        int y = 2;/*numero por el cual vas a dividir*/
        int r = 0;/*acomulador*/
        int re = 0;/*residuo de la division*/
        int cont = 0;/*resultado de la division*/
        
        for ( int i=0; r<=x; i++){       
            r = r + y;
            cont= cont +1;
        }
        r = r - y;
        cont= cont - 1;
        re= x - r;
        if(r!=x){
            System.out.println("El residuo de la division es inexacta");
            System.out.println("El resultado de la division es: " + cont);
            System.out.println("El residuo de la division es: " + re);
        }else{
            System.out.println("El residuo de la division es exacta");
            System.out.println("El resultado de la division es: " + cont);
        }   
    }
}
