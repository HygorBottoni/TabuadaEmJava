package com.mycompany.tabuada;
import java.util.Scanner;
/**
 *
 * @author Hygor
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ### Sistema de tabuada ### ");
        System.out.println("\nDeseja ver a tabuada de qual numero?");
        int num = sc.nextInt();
        for (int i = 1;i<=10;i++){
        int multiplicacao = num * i;
        System.out.println(num+" * "+i+" = "+multiplicacao);
        
        }


    }
}
