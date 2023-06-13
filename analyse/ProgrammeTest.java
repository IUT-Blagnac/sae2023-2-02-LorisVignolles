package exercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        testChaineVide();
        testAvecChiffres();
        testAvecEspaces();
        testClassique();
        testMotNonDansDictionnaire();
    }

    private static void testChaineVide() {
        String str = "";
        List<Character> ordre = Arrays.asList('A', 'B', 'C');
        List<String> result = Exercice.solution(str, ordre);

        System.out.println("Test - Chaine vide");
        System.out.println("Résultat attendu : []");
        System.out.println("Résultat obtenu  : " + result);
        System.out.println();
    }

    private static void testAvecChiffres() {
        String str = "Hello 123 World 456";
        List<Character> ordre = Arrays.asList('H', 'W');
        List<String> result = Exercice.solution(str, ordre);

        System.out.println("Test - Avec chiffres");
        System.out.println("Résultat attendu : [Hello, World]");
        System.out.println("Résultat obtenu  : " + result);
        System.out.println();
    }

    private static void testAvecEspaces() {
        String str = "   Bonjour   le   monde    ";
        List<Character> ordre = Arrays.asList('B', 'L', 'M');
        List<String> result = Exercice.solution(str, ordre);

        System.out.println("Test - Avec espaces");
        System.out.println("Résultat attendu : [Bonjour, le, monde]");
        System.out.println("Résultat obtenu  : " + result);
        System.out.println();
    }

    private static void testClassique() {
        String str = "Hello world! This is a test.";
        List<Character> ordre = Arrays.asList('T', 'H', 'I');
        List<String> result = Exercice.solution(str, ordre);

        System.out.println("Test - Classique");
        System.out.println("Résultat attendu : [This, Hello, is]");
        System.out.println("Résultat obtenu  : " + result);
        System.out.println();
    }

    private static void testMotNonDansDictionnaire() {
        String str = "Hello world! This is a test. N1c3";
        List<Character> ordre = Arrays.asList('N', 'H', 'I');
        List<String> result = Exercice.solution(str, ordre);

        System.out.println("Test - Mot non dans le dictionnaire");
        System.out.println("Résultat attendu : [N1c3, Hello, is]");
        System.out.println("Résultat obtenu  : " + result);
        System.out.println();
    }
}
