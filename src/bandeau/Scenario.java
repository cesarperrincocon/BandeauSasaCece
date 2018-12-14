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
    protected ArrayList<Effet> mesEffets = new ArrayList<>();

    public Scenario(Bandeau monBandeau) {
        this.monBandeau = monBandeau;

    }

    public void ajouterEffet(Effet e) {
        mesEffets.add(e);
    }

    public void jouerScenario() {
        for (Effet e : mesEffets) {

            e.animation();

        }
    }

//       
}
