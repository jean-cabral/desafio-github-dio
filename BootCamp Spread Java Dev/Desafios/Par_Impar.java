package Desafios;

import java.util.Scanner;

/*Faça um programa que peça N numeros inteiros, calcule e mostre a quantidade de numeros pares e impares*/

public class Par_Impar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNum;
        int num;
        int quantPar=0;
        int quantImpar=0;
        
        System.out.println("Quantidade de numeros: ");
        quantNum = sc.nextInt();

        int count=0;

        do{
            System.out.println("Numeros: ");
            num = sc.nextInt();

            if(num%2 ==0){
                quantPar++;

            }else{
                quantImpar++;
            }
            count ++;
        }while(count < quantNum);

        System.out.println("Pares: "+ quantPar);
        System.out.println("Impares: "+quantImpar);

        sc.close();
    }
}