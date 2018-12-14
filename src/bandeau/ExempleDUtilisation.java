package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    private static Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        Scenario scenario = new Scenario(monBandeau);
        Effet_couleur maCouleur = new Effet_couleur(monBandeau);
        Effet_rotation maRotation = new Effet_rotation(monBandeau, "IL EST DE RETOUR...");        
        Effet_zoom monZoom = new Effet_zoom(monBandeau, "EN TOURNEE DANS TOUTE LA FRANCE !");
        Effet_zoom monZoom2 = new Effet_zoom(monBandeau, "JUL");
        Effet_clignotement monClignotement = new Effet_clignotement(monBandeau, "BORDEAUX");
        Effet_clignotement monClignotement1 = new Effet_clignotement(monBandeau, "NANTES");
        Effet_clignotement monClignotement2 = new Effet_clignotement(monBandeau, "LYON");
        Effet_clignotement monClignotement3 = new Effet_clignotement(monBandeau, "PARIS");
        Effet_clignotement monClignotement4 = new Effet_clignotement(monBandeau, "RENNES");
        Effet_clignotement monClignotement5 = new Effet_clignotement(monBandeau, "TOULOUSE");
        Effet_clignotement monClignotement6 = new Effet_clignotement(monBandeau, "LES VILLARDS SUR THONES");
        Effet_zoom monZoom3 = new Effet_zoom(monBandeau, "MARSEILLE");
        
        scenario.ajouterEffet(maCouleur);
        scenario.ajouterEffet(maRotation);
        scenario.ajouterEffet(monZoom);
        scenario.ajouterEffet(monZoom2);
        scenario.ajouterEffet(monClignotement);
        scenario.ajouterEffet(monClignotement1);
        scenario.ajouterEffet(monClignotement2);
        scenario.ajouterEffet(monClignotement3);
        scenario.ajouterEffet(monClignotement4);
        scenario.ajouterEffet(monClignotement5);
        scenario.ajouterEffet(monClignotement6);
        scenario.ajouterEffet(monZoom3);
        scenario.jouerScenario();
    }


    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("Hello");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va changer de police");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne...");
        for (int i = 0; i <= 100; i++) {
            monBandeau.setRotation(2 * Math.PI * i / 100);
            monBandeau.sleep(100);
        }

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Termine");
        //System.exit(0);
    }
}
