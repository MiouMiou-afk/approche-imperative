package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		//Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.Marseille, Bastia, Toulouse, Tigzirt, Tizi
		String[] city = {"Marseille", "Bastia", "Toulouse", "Tigzirt", "Tizi"};
		
		//afficher la longueur du tableau 
		System.out.println(city.length);
		
		// afficher l'entier positionné au dernier index du tableau
		System.out.println(city[4]);
		
		//Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
		city[3] = "Reims";
		
		System.out.println("modification: "+city[3]);
		
		//Affichez les 5 éléments du tableau après modification
		
		city[0] = "Oran";
		city[1] = "Alger";
		city[2] = "Londres";
		city[4] = "Moscou";
		
		System.out.println("modification: "+city[0]);
		System.out.println("modification: "+city[1]);
		System.out.println("modification: "+city[2]);
		System.out.println("modification: "+city[4]);
		
		
		

	}

}
