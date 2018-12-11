/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;


/**
 *
 * @author ssylvest
 */
public class Scenario {
    
private Bandeau monBandeau;
private final Effet_rotation maRotation = new Effet_rotation(monBandeau);
private final Effet_couleur maCouleur = new Effet_Couleur(monBandeau);
private final Effet_zoom monZoom = new Effet_zoom(monBandeau);
private final Effet_clignotement monMot = new Effet_clignotement(monBandeau);
protected ArrayList<Effet> mesEffets = new ArrayList<>();
    
       public Scenario(Bandeau monBandeau){
        this.monBandeau = monBandeau;
    } 
    
    public void Texte(){
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
       
       maCouleur.animation();
       monBandeau.setMessage("IL EST DE RETOUR...");
       monZoom.animation;
       monBandeau.sleep(1000);
       monBandeau.setMessage("EN TOURNEE DANS TOUTE LA FRANCE !");
       monZoom.animation;
       monBandeau.sleep(1000);
       monBandeau.setMessage("JUL");
       maRotation.animation();
       monBandeau.sleep(1000);
       
}
}
