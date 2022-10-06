package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
    
		//DECLARATION DE BASE
	    int[] notes = {
	    		8, -7, 12, 1, -2, 14, 17, 9
	    };
	    
	    //Affichez l’élément du tableaud’index 0 du tableau
	    System.out.println(notes[0]);
	    
	    //Affichez la longueur du tableau
	    System.out.println(notes.length);
	    
	    //Affichez l’entier positionné au dernier index du tableau
	    System.out.println(notes[7]);
	    
	    //Affichez l’entier d’index 10. Pourquoi cela échoue?Affichez un commentaire dans votre code pour l’expliquer.
	    //System.out.println(notes[10]);
	    //échec car l'index 10 n'existe pas le tableau a 8 valeurs d'index 0 à 7 
		
	      
	}

}
