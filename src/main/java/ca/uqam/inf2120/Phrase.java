package ca.uqam.inf2120;

import java.util.ArrayList;
import java.util.Collection;

public class Phrase extends ArrayList< String > {
    /**
     * Tableau contenant les 'Mot Vide' possibles.
     * Reference : https://www.ranks.nl/stopwords/french
     */
    public static String [] MOT_VIDE = {
            "alors", "au", "aucuns", "aussi", "autre", "avant", "avec", "avoir",
            "bon", "ca", "car", "ce", "cela", "ces", "ceux", "chaque", "ci",
            "comme", "comment", "dans", "debut", "dedans", "dehors", "depuis",
            "des", "devrait", "doit", "donc", "dos", "du", "elle", "elles", "en",
            "encore", "essai", "est", "et", "etaient", "etat", "ete", "etions",
            "etre", "eu", "fait", "faites", "fois", "font", "hors", "ici", "il",
            "ils", "je", "juste", "la", "la", "le", "les", "leur", "ma",
            "maintenant", "mais", "meme", "mes", "mien", "moins", "mon", "mot",
            "ni", "nommes", "notre", "nous", "ou", "par", "parce", "pas", "peu",
            "peut", "plupart", "pour", "pourquoi", "quand", "que", "quel",
            "quelle", "quelles", "quels", "qui", "sa", "sans", "ses", "seulement",
            "si", "sien", "son", "sont", "sous", "soyez", "sujet", "sur", "ta",
            "tandis", "tellement", "tels", "tes", "ton", "tous", "tout", "tres",
            "trop", "tu", "voient", "vont", "votre", "vous", "vu"
    };

    public Phrase(){}

    public Phrase( Collection< String > collection ) {
        super( collection );
    }

    /**
     * QUESTION 3
     *
     * Enleve les 'Mot Vide' de la Phrase sans changer l'ordre des autres Mots.
     */
    public void nettoyer() {
        for (int i = 0; i < size(); i++) {
            if (binarySearch(this.get(i), 0, MOT_VIDE.length - 1) != -1) {
                this.remove(i);
                i--;
            }
        }
    }

    static int binarySearch(String search, int left, int right) {
        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (search.compareToIgnoreCase(MOT_VIDE[middle]) > 0) {
            return binarySearch(search, middle + 1, right);
        } else if (search.compareToIgnoreCase(MOT_VIDE[middle]) < 0) {
            return binarySearch(search, left, middle - 1);
        } else {
            return middle;
        }
    }
}
