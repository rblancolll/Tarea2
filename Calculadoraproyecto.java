/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraproyecto;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.Random;
/**
 *
 * @author USER
 */
public class Calculadoraproyecto {

   private static Scanner sc = new Scanner(System.in);
    
    public static void  main(String[]  args) throws InterruptedException{
    
        System.out.println("\n Ingrese numero de Base: :");
        int base=sc.nextInt();
        System.out.println("\n Ingrese numero de Exponente: :");
        int exponente=sc.nextInt();
        
   System.out.println("El resultado es: "+Potencia(base, exponente));
    
   Scanner nuevo=new Scanner(System.in);
    
    System.out.println("Ingrese numero");
    int num1 = nuevo.nextInt();
    double raiz = Math.sqrt(num1);
    System.out.println("La raiz del numero "+num1+" es: "+raiz);
    
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese un numero: ");
    
    int numero = leer.nextInt();
    
    int factorial = 1;
    
    while(numero!=0)
    {
    factorial*=numero;
    numero --;
    }
    System.out.println("El factorial es : "+"\n"+factorial);
    //Thread.sleep(5000);
    
    
    Scanner lee = new Scanner(System.in);
    System.out.println("Ingrese un numero Random: ");
   
    Random dado = new Random();
    
    int numero1 = lee.nextInt();
    
    for (int i=0; i<10;i++){
    
    
    numero1=dado.nextInt(10);
    
    System.out.println("El resulato es:"+numero1);
    
    }
    
    }
    
    public static int Potencia(int base,int exponente) {
        if (exponente==0){
            return 1;
        }else{
            return base*Potencia(base, exponente-1);
        }
   
    }
    
     
     
}
    

    
    
    
   

