package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// Soit le tableau ci-dessous: afficher l'ensemble des éléments grâce à une boucle
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		for (int i=0; i<array.length; i++) {
			System.out.println("Le tableau array contient : "+array[i]);
		}
		
		//Afficher l’ensemble des éléments dans l’ordre inverse du tableau 
		System.out.println("voicic le tableau mais affiché dans l'ordre inverse du tableau");
		 for(int i = 0; i < array.length / 2; i++)
		  {
		      int temp = array[i];
		      array[i] = array[array.length - i - 1];
		      System.out.println(array[array.length - i - 1] = temp);
		       
		  }
		  //afficher les entiers du tableau inversé
		  System.out.println("tableau inversé");
		  for(int i = 0; i < array.length; i++)
		  {
		   System.out.println(array[i]);
		  }
		
		 //Afficher que les entiers supérieurs a trois en combinant une boucle et un test (condition)
		  System.out.println("les entiers superieur à trois dans le tableau sont : \n");
		  for(int i = 0; i < array.length; i++)
		  {
		   if(array[i]>3) {
			   System.out.println("le nombre "+array[i]+" est supérieur à 3");
		   }
		  }
		  
		  //Combiner une boucle et un test de manière à n’afficher que les entiers pairs 
		  
		    System.out.println("Les nombres pairs du tableau sont: ");
		    for (int i = 1; i <= array.length; i++) {
		      if (i % 2 == 0) {
		        System.out.println(i);
		      }
		    }
		    
		    //Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
		    System.out.println("Les nombres dont l'index est pairs du tableau sont: ");
		    for (int i = 1; i <= array.length; i++) {
		      if (i % 2 == 0) {
		        System.out.println(i);
		      }
		    }
		    
		    //Combiner une boucle et un test de manière à n’afficher queles entiers impairs
		    System.out.println("Les nombres dont l'index est impairs du tableau sont: ");
		    for (int h = 1; h <= array.length; h++) {
		      if (h % 2 != 0) {
		        System.out.println(h);
		      }
		    }
		    
		    

	}

}
