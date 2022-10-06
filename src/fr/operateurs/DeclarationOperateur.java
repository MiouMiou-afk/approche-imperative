package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {

		//TESTEZ LES OPERATEURS &&ET ||
		int a= 10;
		int b= 20;
		boolean testEt= a>0 && b<10;
		System.out.println(testEt);
		
		boolean testOu = a>0 || b<10;
		System.out.println(testOu);
		
		//TESTEZ LES OPERATEURS COMBINES
		 a = a+1;
		//afficher la valeur de a 
		System.out.println(a);
		
		a++;
		//afficher la valeur de a 
		System.out.println(a);
		
		a += 1;
		//afficher la valeur de a 
		System.out.println(a);
		
		//les 3 instructions sont équivalentes et permettent d'incrémenter la valeur de 1
		
		//TESTEZ L’OPERATEUR TERNAIRE
		
		String c = a>0? "a est plus grand que 0 : a est inférieur a 0 ":" true ou false";
		System.out.println(c);
	    
		
		
	}

}
