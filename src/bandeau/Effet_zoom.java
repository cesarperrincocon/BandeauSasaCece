package bandeau;

import java.awt.Font;

/**
 *
 * @author cperrinc
 */
public class Effet_zoom {

    public Effet_zoom(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }

    private Bandeau monBandeau;

    public void animation() {
        
        for (int i = 5; i < 50; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }

    }
}
