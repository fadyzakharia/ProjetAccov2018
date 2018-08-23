/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetcameneons;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FADY
 */
public class Cameneons implements Runnable //extends Thread
{
    // Variables
    private final IdentificateurCameneon id;// Chaque Cameneon a un identifiant unique
    private Couleur maCouleur;
    private Couleur autreCouleur;
    private final Foret foret;
    private boolean msg;
    
    // Constructeur Cameneons
    Cameneons(IdentificateurCameneon id1,Foret f, Couleur c)
    {
        this.id = id1;
        this.foret =f;
        this.maCouleur = c;
    }
    
    // Fonction qui affiche le comportement actuel du Cameneon
    private void comportementActuel(String msg)
    {
        System.out.println("Mon Identificateur : "+this.id+" / Ma couleur : "+this.maCouleur+" / Etat : "+msg);
    }
    
    // 1 - Cycle de vie : Manger
    private void manger()
    {
        comportementActuel("Je manges");
    }
    
    // 2 - Cycle de vie : entraîner
    private void entrainer()
    {
        comportementActuel("J'entraînes");
    }
    
    // 3 - Cycle de vie : aller au 'mail' 
    private void allerAuMail()
    {
        comportementActuel("Je veux aller au Mail");
    }
    
    // 4 - Cycle de vie : subir une nouvelle mutation
    private void nouvelleMutation() throws InterruptedException
    {
        comportementActuel("Mutation en cours");
        autreCouleur = foret.cooperer(id, maCouleur);
        maCouleur = Couleur.changerCouleur(autreCouleur);
        comportementActuel("Mutation terminé");
    }
    
    //public Thread thread;
    
    public void run()
    {
        while(true)
        {
            try {
                this.manger();
                this.entrainer();
                this.allerAuMail();
                this.nouvelleMutation();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cameneons.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /*
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    /*
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
   
}
