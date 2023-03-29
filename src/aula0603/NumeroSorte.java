package aula0603;

import java.util.Scanner;
import java.util.Random;

public class NumeroSorte {

    
      public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        java.util.Random random = new java.util.Random();
        
            boolean acertou = false;
            int tentativas =  10;
            int numero_aleatorio = random.nextInt(50);
            long chute = 0;
            
            
            while(tentativas >0 && acertou == false){
                System.out.println("Qual seu chute?");
                chute = input.nextLong();
                
                if(numero_aleatorio == chute){
                    System.out.println("Você acertou!");
                    acertou = true;
                }else if(chute < numero_aleatorio){
                    --tentativas;
                    System.out.println("Numero muito pequeno " + tentativas + " tentativas restantes");
                    
                    
                }else{
                      --tentativas;
                    System.out.println("Numero muito grande! " + tentativas + " tentativas restantes");
                }
                
                
                
            }
          
       
    }
}

