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
public class Foret 
{
    private Couleur couleur1,couleur2;
    public static boolean appel1 = true; 
    public static boolean attendre = false; 
    private Couleur couleurFinal;
    
    public synchronized Couleur cooperer(IdentificateurCameneon id, Couleur c) throws InterruptedException
    {
        while(attendre)
        {
            try
            {
                System.out.println("Attends pour deuxième Cameneon pour arriver  ...");
                wait();
            } 
            catch(InterruptedException e)
            {
                 //e.printStackTrace();
            }
        }
        if(appel1)
        {
            couleur1 = c;
            appel1 = false;
            while(!appel1)
            {
                try
                {
                    wait();
                }
                catch(InterruptedException e)
                {
                     //e.printStackTrace();
                }
            }
            attendre = false;
            notifyAll();
            couleurFinal = couleur2;
        }
        else
        {
            couleur2 = c;
            appel1 = true;
            attendre = true;
            notifyAll();
            couleurFinal = couleur1;
        }
        return couleurFinal;
    }
}
