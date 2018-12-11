/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author cperrinc
 */
public class Effet_clignotement {

    private Bandeau monBandeau;

    public Effet_clignotement(Bandeau monBandeau) {
        this.monBandeau = monBandeau;
    }

    public void animation() {
        for (int i = 0; i < 11; i += 1) {
            monBandeau.sleep(250);
            monBandeau.setMessage("");
            monBandeau.sleep(250);
        }
    }

}
