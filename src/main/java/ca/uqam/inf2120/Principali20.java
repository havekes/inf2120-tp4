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
     *
     *
     *
     *
     *
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
        // Placez votre code ici pour la question 1.

    }


    /**
     * QUESTION 2
     *
     * type F : equals.
     *
     * ************************************************************************
     * Placez votre Lamda ici :
     *
     *
     *
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
        // Placez votre code ici pour la question 2.

    }




    public static void main( String [] argv ) {
    }
}
