package meilleur;

import java.util.*;

public class SimpliciteMeilleur {

	 public static List<String> solution(String str, List<Character> ordre) {
	        String[] tabMot;

	        tabMot = str.split("[^a-zA-Z0-9]+"); //Expression régulière : lettres min, maj et chiffres

	        List<String> liste = Arrays.asList(tabMot);
	        
	       

	        liste.sort((mot1, mot2) -> {
	            int minLength = Math.min(mot1.length(), mot2.length());
	            for (int i = 0; i < minLength; i++) {
	                char c1 = Character.toLowerCase(mot1.charAt(i));
	                char c2 = Character.toLowerCase(mot2.charAt(i));
	                int index1 = ordre.indexOf(c1);
	                int index2 = ordre.indexOf(c2);
	                if (index1 != -1 && index2 != -1 && index1 != index2) {
	                    return Integer.compare(index1, index2);
	                } else if (index1 == -1 && index2 != -1) {
	                    return 1; // mot1 commence par une lettre non présente dans l'ordre
	                } else if (index1 != -1 && index2 == -1) {
	                    return -1; // mot2 commence par une lettre non présente dans l'ordre
	                }
	            }
	            return Integer.compare(mot1.length(), mot2.length());
	        });
	        
	     

	        return liste;
	    }
}
