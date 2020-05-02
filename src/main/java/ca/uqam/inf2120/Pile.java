package ca.uqam.inf2120;

public class Pile< E > {
    private class Chainon {
        public E valeur;
        public Chainon precedant;

        public Chainon( E valeur, Chainon precedant ) {
            this.valeur = valeur;
            this.precedant = precedant;
        }
    }

    protected Chainon sommet;

    /**
     * QUESTION 4
     *
     * Echange les deux premier chainons de place.
     *
     * Le chainon contenant le sommet et le chainon precedant sont echanges.
     * Ce N'EST PAS seulement les valeurs qui change, mais les chainons.
     * Cela va vous demander de deplacer les references (pointeur).
     *
     *
     * ************************************************************************
     * Placez vos explications ici :
     *
     * On verifie d'abord que la pile contient au moins 2 elements
     * Ensuite on defini 2 variables temporaires :
     *   - deuxieme est le chainon precedent au sommet de la pile,
     *     donc le 2e en partant du haut de la pile
     *   - troisieme est le chainon precedent a deuxieme, soit le 3e en partant
     *     du haut de la pile, il peut etre null si la pile contient 2 elements
     *
     * On definit le chainon precedent a deuxieme comme le sommet (2e.precedent -> 1e)
     * et on definir le chaine precedent a sommet comme etant troisieme (1e.precedent -> 3e)
     * Cela permet d'echanger les deux premiers elements de la pile.
     * Il reste a faire pointer le sommet de la pile vers
     * le nouveau 1er element qui est deuxieme  (sommet -> 2e)
     * On a alors (sommet -> 2e -> 1e -> 3e)
     * ************************************************************************
     *
     */
    public void echanger() {
        if (!estVide() && sommet.precedant != null) {
            Chainon deuxieme = sommet.precedant;
            Chainon troiseme = deuxieme.precedant;
            deuxieme.precedant = sommet;
            sommet.precedant = troiseme;
            sommet = deuxieme;
        }
    }

    public boolean estVide() {
        return null == sommet;
    }

    public E sommet() throws ExceptionPileVide {
        if( null == sommet ) {
            throw new ExceptionPileVide( "sommet" );
        }

        return sommet.valeur;
    }

    public void empiler( E valeur ) {
        sommet = new Chainon( valeur, sommet );
    }

    public E depiler() throws ExceptionPileVide {
        if( null == sommet ) {
            throw new ExceptionPileVide( "depiler" );
        }

        E temp = sommet.valeur;
        sommet = sommet.precedant;

        return temp;
    }
}
