package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numberTab = {
		    		1, 2, 3, 4, 5, 6, 7, 8, 9, 10 
		    };
		 //afficher le premier élément du tableau
		 System.out.println(numberTab[0]);
		 
		 //afficher la longueur du tableau en utlisant la proprieté length
		 System.out.println(numberTab.length);
		 
		 //Affichez le dernier élément du tableau en utilisant la propriété length
		 
		 for(int i=0; i<numberTab.length; i++) {
			 
			if(i == numberTab.length) {
				System.out.println(numberTab[i]);
			}

		 }
		 //Modifiezla valeur de l’élément d’index 4 et donnezlui la valeur 8.
		 numberTab[4]=8;
		 
		 System.out.println(numberTab[4]);
		 

	}

}
