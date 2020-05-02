package ca.uqam.inf2120;

import java.util.function.Function;

public class Principali20 {
    /**
     * QUESTION 1
     *
     * Cette methode tri le tableau.
     * Le tri est fait comme le tri slection, mais a chaque tour de la boucle
     * interne, vous devez choisir le minimum et le maximum.
     * Lorsque la boucle interne les a trouve, alors elle les places au bon
     * endroit.
     *
     * ************************************************************************
     * Placez votre analyse de complexite temporelle ici, analyse de pire cas :
     *
     * La boucle externe effectue n/2 tours
     * La boucle interne effectue (n-1)n/2 tours (comme dans le tri selection classique)
     * La complexite est donc O(n^2)
     *
     *
     *
     *
     * ************************************************************************
     *
     * @param tab Le tableau a trier.
     * @param <E> Le type des elements du tableau.  Le tri utilise le comparateur
     *           de ce type (Comparable).
     */
    public static < E extends Comparable< E > >
    void triDoubleSelection( E [] tab ) {
        for (int i = 0; i < tab.length / 2; i++) {
            int last = tab.length - i - 1;
            E min = tab[i];
            E max = tab[last];
            int minPosition = i;
            int maxPosition = last;

            for (int j = i + 1; j <= last; j++) {
                if (tab[j].compareTo(min) < 0) {
                    minPosition = j;
                    min = tab[j];
                }
                if (tab[last - j].compareTo(max) > 0) {
                    maxPosition = last - j;
                    max = tab[last - j];
                }
            }

            tab[minPosition] = tab[i];
            tab[i] = min;

            if (maxPosition != minPosition && maxPosition != i) {
                tab[maxPosition] = tab[last];
                tab[last] = max;
            }
        }
    }


    /**
     * QUESTION 2
     *
     * type F : equals.
     *
     * ************************************************************************
     * Placez votre Lamda ici :
     * (s) -> s.length() >= 5 && Character.isUpperCase(s.charAt(0)) ? 0 : 1
     *
     * ************************************************************************
     *
     * @param tab Le tableau a classer.
     * @param classification Une fonction qui transforme les éléments en éléments utiliés
     *                       pour la comparaison et la classification.
     * @param <E> Type des éléments de bases
     * @param <F> Type des éléments transformés
     */
    public static < E, F >
    void classer( E [] tab, Function< E, F > classification ) {
        for (int i = 0; i < tab.length; i++) {
            int j = i;
            E temp = tab[i];
            while (j > 0 && classification.apply(temp).equals(0)) {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = temp;
        }
    }


    public static void main( String [] argv ) {
    }
}
