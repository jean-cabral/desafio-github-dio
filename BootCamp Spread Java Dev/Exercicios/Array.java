package Exercicios;

public class Array {
    public static void main(String[] args) {
        
        int[] vetor = new int[3];
        
        vetor[1]=0;
        vetor[0]= 94;
        vetor[2]= 41;
        //System.out.println(vetor[1]);
       // System.out.println(vetor[2]);
        

        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
