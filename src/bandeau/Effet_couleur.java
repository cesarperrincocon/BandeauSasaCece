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
public class Effet_couleur {
    
private Bandeau monBandeau;


      public Effet_couleur(Bandeau monBandeau){
        this.monBandeau = monBandeau;
    
    }



public void animation(){
monBandeau.setBackground(Color.BLACK);
        monBandeau.setForeground(Color.YELLOW);
        for (int i = 5; i < 50; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }

}
}

