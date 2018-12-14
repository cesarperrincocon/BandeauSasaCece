package bandeau;

import java.awt.Font;

/**
 *
 * @author cperrinc
 */
public class Effet_zoom extends Effet{

       private Bandeau monBandeau;
    private String msg;

    
    public Effet_zoom(Bandeau monBandeau, String msg) {
        this.monBandeau = monBandeau;
        this.msg=msg;
    }

 
    public void animation() {
        
        for (int i = 5; i < 50; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }

    }
}
