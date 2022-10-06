package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {

		//création d'un tableau conteant les nombres de 1 à 10
		
		 int[] numberTab = {
		    		1, 2, 3, 4, 5, 6, 7, 8, 9, 10 
		    };
		 for(int i = 0; i < numberTab. length; i++) {
			 
			 System.out.println(numberTab[i]);
		 };
     
 		 //afficher 20 fois votre nom et votre prénom
		 String[] userName = {"Myriam", "Agag"};
		int j = 0;
		for (j=0; j<20; j++) {
			System.out.println("Mon prénom est : " + userName[0] + " mon nom de famille est : " +userName[1]);
			
		};
		
		//Affichez les éléments pairs de 2 à 10
		
		int n = 100;
	    System.out.println("Les nombres pairs de 1 à "+n+" sont: ");
	    for (int k = 1; k <= n; k++) {
	      if (k % 2 == 0) {
	        System.out.println(k);
	      }
	    }
	    ////Affichez les éléments pairs de 2 à 10
		int m = 100;
	    System.out.println("Les nombres pairs de 1 à "+m+" sont: ");
	    for (int h = 1; h <= m; h++) {
	      if (h % 2 != 0) {
	        System.out.println(h);
	      }
	    }
	    
	  
	}
	
	
}
