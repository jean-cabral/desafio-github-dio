package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Mac_Pronalds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int produtos=0, quantidade=0;
		double res=0, valor=0;
		int N = Integer.parseInt(sc.nextLine());
		
		
		for (int x=0 ; x<N ; x++){
			produtos = sc.nextInt();
			quantidade  = sc.nextInt();
			
		switch(produtos){
		  case 1001:
		    valor = 1.50;
		    break ;
		  case 1002:
		    valor = 2.50;
		    break ;
		    case 1003:
		    valor = 3.50;
		    break ;
		    case 1004:
		    valor = 4.50;
		    break ;
		    case 1005:
		    valor = 5.50;
		    break;
		  }
			
			res += valor * quantidade;
		}
		System.out.printf("%.2f\n",res);
		sc.close();
	}
}