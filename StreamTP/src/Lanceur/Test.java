package Lanceur;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;


public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Liste de personnes 
		List <Personne> lp= new ArrayList<Personne>();
		//Lecture du fichier
		File f = new File("/Users/brahamax/eclipse-workspace/StreamTP/src/Lanceur/etudiant.txt");
		Scanner lecteur = new Scanner(f);
		//Parcours du fichier
		String s="";
		System.out.println("Liste des étudiants");
		while (lecteur.hasNext()){
			var a = lecteur.next();   
				//Parser
                if(!a.toString().equals("-"))
                {    s=s+a.toString()+" ";		
                }                
                else {
                //Création de l'objet personne	
                System.out.println(s.toString());
                //Ajout à la liste
                lp.add(new Personne(s));
                s="";
                }
	}
		 //Création du Stream
		 Stream <Personne> st = lp.stream();
		 //Utilisation de la methode filtrage
		 System.out.println("\n\nApres Filtrage");
		 st.filter(x -> x.getNomcomplet().contains("SO") || x.getNomcomplet().contains("so") )
		 //Affichage de toutes les personnes qui correspondent au filtrage appliqué 
		 .forEach(x -> System.out.println(x.getNomcomplet()));
   } 
		 
}	
