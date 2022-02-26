package Desafios;

import java.util.Scanner;

public class Trigo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdEntradas = scan.nextInt();
        for (int i = 0; i < qtdEntradas; i++) {
            int n = scan.nextInt();
            long kg;
            if (n < 14) {
                kg = 0;
            }else{
                kg = ((long) Math.pow(2, n - 2)) / 3000;
            }
            System.out.println(kg + " kg"); 
        }
        scan.close();
    }
}
