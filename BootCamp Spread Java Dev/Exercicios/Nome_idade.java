package Exercicios;

import java.util.Scanner;

public class Nome_idade {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        while(true){
            System.out.println("Digite o nome: ");
            nome = sc.next();
            if(nome.equals("0")){
                break;
            }
            System.out.println("Digite a idade: ");
            idade = sc.nextInt(); 

        }
        System.out.println("Final do programa");
        sc.close();
    }
    
}

