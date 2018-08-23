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
//Chaque "caménéon" sera représenté par un identifiant unique et une couleur
public class IdentificateurCameneon 
{
    private final int valeur;
    
    public IdentificateurCameneon(int val)
    {
        valeur = val;
    }

    IdentificateurCameneon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString()
    {
        return valeur + "";
    }
}
