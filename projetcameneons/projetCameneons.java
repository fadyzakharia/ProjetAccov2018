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
public class projetCameneons 
{
    
    static Couleur[] Couleurs =
    {
        Couleur.BLEU,
        Couleur.JAUNE,
        Couleur.ROUGE,
        Couleur.BLEU,
        Couleur.ROUGE,
        Couleur.BLEU,
        Couleur.JAUNE,
        Couleur.BLEU,
        Couleur.ROUGE,
        Couleur.JAUNE,
    } ;
     // create an array of type chameleon

    static Cameneons[] Cameneons = new Cameneons[Couleurs.length];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Foret foret = new Foret();
        for (int i = 0 ;i<Couleurs.length;i++)
        {
            Cameneons[i] = new Cameneons(new IdentificateurCameneon(i),foret,Couleurs[i]);
            new Thread(Cameneons[i]).start();

        }
    }
    
}
