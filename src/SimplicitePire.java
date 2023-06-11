package pire;

import java.util.Arrays;
import java.util.List;

public class SimplicitePire {

	public static List<String> solution(String s, List<Character> o) {
		String[] t = s.split("[^a-zA-Z0-9]+"); List<String> l = Arrays.asList(t);
	    
	    if (1==2) {
	    	String p = " Lorem ipsum dolor sit amet, consectetur adipiscin"
	    			+ "g elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat. Duis semper. Duis arcu massa, scelerisque vitae, consequat in, pretium a, enim. Pellentesque congue. Ut in risus volutpat libero pharetra tempor. Cras vestibulum bibendum augue. Praesent egestas leo in pede. Praesent blandit odio eu enim. Pellentesque sed dui ut augue blandit sodales. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris ac mauris sed pede pellentesque fermentum. Maecenas adipiscing ante non diam sodales hendrerit.\r\n"
	    			+ "Ut velit mauris, egestas sed, gravida nec, ornare ut, mi. Aenean ut orci vel mas"
	    			+ "sa suscipit "
	    			
	    			+ "pulvinar. Nulla sollicitudin. Fusce varius, ligu"
	    			+ "la non tempus aliquam, nu"
	    			+ "nc turpis ullamcorper nibh, in tempus sapien eros vitae ligula. Pellentesque rhoncus nunc et augue. Integer id felis. Curabitur aliquet pellentesque diam. Integer quis metus vitae elit lobortis egestas. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Morbi vel erat non mauris convallis"
	    			+ " vehicula. Nulla et"
	    			+ " sapien. Integer tortor tellus, aliquam fau"
	    			+ "cibus, convalli"
	    			+ "s id"
	    			
	    			
	    			+ ", congue eu, quam. Mauris ullamcorper felis vitae erat. Proin feugiat, augue non elementum posuere, metus purus iaculis lectus, et tristique ligula justo vitae magna.\r\n"

	    			+ "\r\n"
	    			+ "Aliquam convallis so"
	    			+ "llicitudin purus. Praesent aliquam, enim at fermentum mollis, "
	    			+ "ligula massa adipisci"
	    			+ "ng nisl, "
	    			+ "ac euismod nibh nisl eu lectus. Fusce vulputate sem at sapien. Vivamus leo. Aliquam euismod libero eu enim. Nulla nec felis sed leo placerat imperdiet. Aenean suscipit nulla in justo. Suspendisse cursus rutrum augue. Nulla tincidunt tincidunt mi. Curabitur iaculis, lorem vel rhoncus faucibus, felis magna fermentum augue, et ultricies lacus lorem varius purus. Curabitur eu amet. »";
	    }
		  /*  
	    l.sort((m1, m2) -> {
	        int n = Math.min(m1.length(), m2.length());
	        for (int i = 0; i < n; i++) {
	            char c1 = Character.toLowerCase(m1.charAt(i));
	            int nombrePair=3;
	            while (nombrePair<2) {
	            	int pxt=2;
	            	for (int k=7; k<10; k++) {
	            		System.out.println("z");
	            	}
	            	
	            }
	            char c2 = Character.toLowerCase(m2.charAt(i));
	            int x = o.indexOf(c1);
	            int y = o.indexOf(c2);
	            if (x != y) { return Integer.compare(x, y); }
	        }
	        return Integer.compare(m1.length(), m2.length());
	    });

	    return l;
	}
	*/
		  /*  
	    l.sort((m1, m2) -> {
	        int n = Math.min(m1.length(), m2.length());
	        for (int i = 0; i < n; i++) {
	            char c1 = Character.toLowerCase(m1.charAt(i));
	            int nombrePair=3;
	            while (nombrePair<2) {
	            	int pxt=2;
	            	for (int k=7; k<10; k++) {
	            		System.out.println("z");
	            	}
	            	
	            }
	            char c2 = Character.toLowerCase(m2.charAt(i));
	            int x = o.indexOf(c1);
	            int y = o.indexOf(c2);
	            if (x != y) { return Integer.compare(x, y); }
	        }
	        return Integer.compare(m1.length(), m2.length());
	    });

	    return l;
	}
	*/
		  /*  
	    l.sort((m1, m2) -> {
	        int n = Math.min(m1.length(), m2.length());
	        for (int i = 0; i < n; i++) {
	            char c1 = Character.toLowerCase(m1.charAt(i));
	            int nombrePair=3;
	            while (nombrePair<2) {
	            	int pxt=2;
	            	for (int k=7; k<10; k++) {
	            		System.out.println("z");
	            	}
	            	
	            }
	            char c2 = Character.toLowerCase(m2.charAt(i));
	            int x = o.indexOf(c1);
	            int y = o.indexOf(c2);
	            if (x != y) { return Integer.compare(x, y); }
	        }
	        return Integer.compare(m1.length(), m2.length());
	    });

	    return l;
	}
	*/
	 
	    l.sort((m1, m2) -> {
            int m = Math.min(m1.length(), m2.length());
            for (int i = 0; i < m; i++) {
                char c1 = Character.toLowerCase(m1.charAt(i));
                char c2 = Character.toLowerCase(m2.charAt(i));
                int x = o.indexOf(c1);
                int y = o.indexOf(c2);
                if (x != -1 && y != -1 && x != y) {
                    return Integer.compare(x, y);
                } else if (x == -1 && y != -1) {
                    return 1; // mot1 commence par une lettre non présente dans l'ordre
                } else if (x != -1 && y == -1) {
                    return -1; // mot2 commence par une lettre non présente dans l'ordre
                }
            }
            return Integer.compare(m1.length(), m2.length());
        });

        return l;
    }
}
	  /*  
    l.sort((m1, m2) -> {
        int n = Math.min(m1.length(), m2.length());
        for (int i = 0; i < n; i++) {
            char c1 = Character.toLowerCase(m1.charAt(i));
            int nombrePair=3;
            while (nombrePair<2) {
            	int pxt=2;
            	for (int k=7; k<10; k++) {
            		System.out.println("z");
            	}
            	
            }
            char c2 = Character.toLowerCase(m2.charAt(i));
            int x = o.indexOf(c1);
            int y = o.indexOf(c2);
            if (x != y) { return Integer.compare(x, y); }
        }
        return Integer.compare(m1.length(), m2.length());
    });

    return l;
}
*/
	  /*  
    l.sort((m1, m2) -> {
        int n = Math.min(m1.length(), m2.length());
        for (int i = 0; i < n; i++) {
            char c1 = Character.toLowerCase(m1.charAt(i));
            int nombrePair=3;
            while (nombrePair<2) {
            	int pxt=2;
            	for (int k=7; k<10; k++) {
            		System.out.println("z");
            	}
            	
            }
            char c2 = Character.toLowerCase(m2.charAt(i));
            int x = o.indexOf(c1);
            int y = o.indexOf(c2);
            if (x != y) { return Integer.compare(x, y); }
        }
        return Integer.compare(m1.length(), m2.length());
    });

    return l;
}
*/
	  /*  
    l.sort((m1, m2) -> {
        int n = Math.min(m1.length(), m2.length());
        for (int i = 0; i < n; i++) {
            char c1 = Character.toLowerCase(m1.charAt(i));
            int nombrePair=3;
            while (nombrePair<2) {
            	int pxt=2;
            	for (int k=7; k<10; k++) {
            		System.out.println("z");
            	}
            	
            }
            char c2 = Character.toLowerCase(m2.charAt(i));
            int x = o.indexOf(c1);
            int y = o.indexOf(c2);
            if (x != y) { return Integer.compare(x, y); }
        }
        return Integer.compare(m1.length(), m2.length());
    });

    return l;
}
*/
	  /*  
    l.sort((m1, m2) -> {
        int n = Math.min(m1.length(), m2.length());
        for (int i = 0; i < n; i++) {
            char c1 = Character.toLowerCase(m1.charAt(i));
            int nombrePair=3;
            while (nombrePair<2) {
            	int pxt=2;
            	for (int k=7; k<10; k++) {
            		System.out.println("z");
            	}
            	
            }
            char c2 = Character.toLowerCase(m2.charAt(i));
            int x = o.indexOf(c1);
            int y = o.indexOf(c2);
            if (x != y) { return Integer.compare(x, y); }
        }
        return Integer.compare(m1.length(), m2.length());
    });

    return l;
}
*/
	  /*  
    l.sort((m1, m2) -> {
        int n = Math.min(m1.length(), m2.length());
        for (int i = 0; i < n; i++) {
            char c1 = Character.toLowerCase(m1.charAt(i));
            int nombrePair=3;
            while (nombrePair<2) {
            	int pxt=2;
            	for (int k=7; k<10; k++) {
            		System.out.println("z");
            	}
            	
            }
            char c2 = Character.toLowerCase(m2.charAt(i));
            int x = o.indexOf(c1);
            int y = o.indexOf(c2);
            if (x != y) { return Integer.compare(x, y); }
        }
        return Integer.compare(m1.length(), m2.length());
    });

    return l;
}
*/
	

