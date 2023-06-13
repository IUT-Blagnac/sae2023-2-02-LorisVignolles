import java.util.ArrayList;
import java.util.List;

public class ExecutionTimeCalculator {
    public static void main(String[] args) {
        // Mesure du temps d'exécution
        long startTime = System.nanoTime(); // Enregistre le temps de départ

        // Appel de votre méthode ou bloc de code à mesurer
        List<String> result = solution("Ceci est une chaine de texte moyennement longue", List.of('a', 'z', 'm', 'c', 'e', 'u'));
        System.out.println(result);

        long endTime = System.nanoTime(); // Enregistre le temps de fin
        long executionTime = endTime - startTime; // Calcule le temps d'exécution en nanosecondes



        System.out.println("Temps d'exécution : " + executionTime + " nanosecondes");
    }