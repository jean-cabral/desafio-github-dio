package Desafios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Fuso_Horario {

	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int horaSaida = Integer.parseInt(st.nextToken());
		int tempoViagem = Integer.parseInt(st.nextToken());
		int fusoH = Integer.parseInt(st.nextToken());
		int ajuste = (horaSaida+tempoViagem) + fusoH;
		
		if(ajuste==24|| ajuste==0){
		    
		    System.out.println("0");
		}
		else if(ajuste<24){
			System.out.println(ajuste);
		}
		else if(ajuste>24){
			
				ajuste -= 24;
				System.out.println(ajuste);
		}
	}
		
		
		
		/*FAZER O DESAFIO DO GRÃO E DA DAMA*/
}
