/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_18_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("numero correspondiente al dia (1-7)");
        dia = captu.nextInt();
        captu.nextLine();
        
        if(dia == 1){
            System.out.println("lunes");
        }else if(dia == 2){
             System.out.println("martes");
        }else if(dia == 3){
            System.out.println("miercoles");
        }else if(dia == 4){
            System.out.println("jueves");
        }else if(dia == 5){
            System.out.println("viernes");  
        }else if(dia == 6){     
            System.out.println("sabado");
        }else if(dia == 7){     
            System.out.println("domingo");
         }else{     
           System.out.println("numero no valido");
        }
        
    }
    
}
