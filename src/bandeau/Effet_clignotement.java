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
public class Effet_clignotement extends Effet {

    private Bandeau monBandeau;
    private String msg;

    public Effet_clignotement(Bandeau monBandeau, String msg) {
        this.monBandeau = monBandeau;
        this.msg = msg;
    }

    public void animation() {
        monBandeau.setMessage(msg);

        monBandeau.sleep(250);
        monBandeau.setMessage("");
        monBandeau.sleep(250);

    }
}
