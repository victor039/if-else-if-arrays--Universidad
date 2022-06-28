
package atm;

import java.util.Scanner;


public class ATM {

    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
      Scanner entrada2 = new Scanner(System.in);

      int num1,num2;
      
        System.out.println("----------Comparar edades---------");
        System.out.println("Debes pulsar ENTER despues de introducir cada digito.");
        System.out.println("");
        
        System.out.print("Ingrese el primer digito:");
        num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo digito:");
        num2 = entrada2.nextInt();
      
    if(num1<num2){
        
        System.out.println("El numero " + num1 + " es menor que " + num2);
      
    }else if(num2>num1){
        System.out.println("El numero " + num2 + " es mayor que" + num1);
    }
    
}
}
