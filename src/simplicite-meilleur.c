#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int comparerMots(const char *mot1, const char *mot2, const char *ordre) {
  int minLength = strlen(mot1) < strlen(mot2) ? strlen(mot1) : strlen(mot2);
  // vrai         //faux

  // réutilisation de l'algo utilisé en Java mais adapté en C
  for (int i = 0; i < minLength; i++) {
    char c1 = tolower(mot1[i]);
    char c2 = tolower(mot2[i]);

    char *index1 =
        strchr(ordre, c1); // strchr cherche l'indice du caractère dans le mot
    char *index2 = strchr(ordre, c2);

    if (index1 != NULL && index2 != NULL) {
      if (index1 != index2) {
        return index1 - index2; // Determine la position
      }
    } else if (index1 == NULL && index2 != NULL) {
      return 1; // mot1 commence par une lettre non présente dans l'ordre
    } else if (index1 != NULL && index2 == NULL) {
      return -1; // mot2 commence par une lettre non présente dans l'ordre
    }
  }

  return strlen(mot1) -
         strlen(
             mot2); // si première lettre identiques trie par longueur des mots
}

// réutilisation de l'algo utilisé en Java mais adapté en C
void solution(char **liste, int taille, const char *ordre) {
  for (int i = 1; i < taille; i++) {
    char *mot = liste[i];
    int j = i - 1;

    while (j >= 0 && comparerMots(liste[j], mot, ordre) > 0) {
      liste[j + 1] = liste[j];
      j--;
    }

    liste[j + 1] = mot;
  }
}
