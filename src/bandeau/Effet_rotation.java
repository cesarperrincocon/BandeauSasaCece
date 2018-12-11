/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author ssylvest
 */
public class Effet_rotation extends Effet {
  private Bandeau monBandeau;  
    
   
  
      public Effet_rotation(Bandeau monBandeau){
        this.monBandeau = monBandeau;
    
    }
  
  
  
    public void animation(){
    
    for (int i = 0; i <= 100; i++) {
			monBandeau.setRotation(2*Math.PI*i / 100);
			monBandeau.sleep(100);
		}
    
    
}
}
