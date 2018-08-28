/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetcameneons;

/**
 *
 * @author FADY
 */
public class Couleur 
{
    private static final int nbr = 3;
    public static int couleurInterne;
    static Couleur JAUNE;
    static Couleur BLEU;
    static Couleur ROUGE;
    
    String[] couleurs = { "Bleu", "Jaune", "Rouge"};
    //private final int couleur;

    Couleur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum ListeCouleurs 
    {
        ROUGE {
            public void couleurChoisi() {
                couleurInterne = 0;
            }
        },
        BLEU {
            public void couleurChoisi() {
                couleurInterne = 1;
            }
        }, JAUNE {
            public void couleurChoisi() {
                couleurInterne = 2;
            }
        }
    };

    //public abstract boolean couleurChoisi();
    /*
    private Couleur(int couleur)
    {
        Couleur.couleurInterne = couleur;
    } */
    
    // Constructeur

    /**
     *
     * @param valCouleur
     */
    public Couleur(int valCouleur)
    {
        Couleur.couleurInterne = valCouleur/nbr;
    }
    
    // Methode pour change la couleur du Cameneon
    public static Couleur changerCouleur(Couleur c)
    {
        if(couleurInterne == Couleur.couleurInterne)
        {
            return new Couleur(couleurInterne) {};
        }
        else
        {
            return new Couleur( nbr - couleurInterne -	Couleur.couleurInterne) {};
        }
    }
    
    @Override
    public String toString()
    {
        switch(couleurInterne)
        {
            case 0:
                return "Rouge";
            case 1:
                return "Bleu";
            case 2:
                return "Jaune";
        }
        return "";
    }
}
