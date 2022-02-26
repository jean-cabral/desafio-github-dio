package Exercicios;

import java.util.Scanner;

public class Maior_media{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int maior=0;
        int soma=0;
        
        int i=0;
        do{
            System.out.println("Numero: ");
            num=sc.nextInt();
            soma += num;
            if(num>maior){
                maior=num;
            }
            i++;
        }while(i<5);

        System.out.println(maior);
        System.out.println((soma/5));

        sc.close();
    }
}