/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificacioncedulajimenez;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class VerificacionCedulaJimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cedula;
        int numero = 0, suma = 0, resultado  = 0;
        
        
        System.out.println("Ingrese cedula");
        cedula = leer.nextLine();
        
        for (int i = 0; i < cedula.length(); i++) {
            numero = Integer.parseInt(String.valueOf(cedula.charAt(i)));
            if(i%2 == 0) {
                numero = numero * 2;
                if (numero > 9 ){
                    numero = numero - 9;   
               }
            }
            suma = suma + numero;
        }
       
        if(suma%10 != 0){
        resultado = 10 - (suma%10);
            if(resultado == numero){
                System.out.println("La cedula"+cedula+"es ecuatoriana");
            }else{
                System.out.println("La cedula"+cedula+" no es ecuatoriana");
            }
        }else{
            System.out.println("Su cedula "+cedula+" es ecuatoriana");
                
            }
    }
                 
}

