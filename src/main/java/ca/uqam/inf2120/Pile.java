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
