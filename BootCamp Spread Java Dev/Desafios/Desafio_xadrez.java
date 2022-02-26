package Desafios;

import java.util.Scanner;

public class Desafio_xadrez{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.print("Digite a linha: ");
    int l = sc.nextInt();
    // System.out.print("Digite a coluna: ");
    int c = sc.nextInt();
    
    if((l+c)%2==0){
      System.out.println("\n1");
    }else{
      System.out.println("\n0");
    }
    
    sc.close();
  }
}
