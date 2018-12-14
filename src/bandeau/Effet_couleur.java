/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;


import java.awt.Color;
import java.awt.Font;


/*
/**
 *
 * @author ssylvest
 */
public class Effet_couleur extends Effet {
    
private Bandeau monBandeau;



      public Effet_couleur(Bandeau monBandeau){
        this.monBandeau = monBandeau;
        
    
    }



@Override
public void animation(){
    
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        
        monBandeau.setBackground(Color.BLACK);
        monBandeau.setForeground(Color.YELLOW);

        }

}


