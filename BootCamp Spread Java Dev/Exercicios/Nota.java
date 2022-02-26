package Exercicios;

import java.util.Scanner;

public class Nota{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;
        System.out.println("DIGITE A NOTA: ");
        nota=sc.nextInt();
        while(nota < 0 || nota > 10 ){
            System.out.println("Nota invalida, digite novamente: ");
            nota=sc.nextInt();
        }
        System.out.println("A nota foi: "+ nota);
        sc.close();
    }
}