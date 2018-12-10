package bandeau;

//commentaire test 
import java.awt.Color;
import java.awt.Font;

public class Pub_JUL {

    private final Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        new Pub_JUL().exemple();
    }

    public void exemple() {

        monBandeau.setBackground(Color.BLACK);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.setMessage("Il est de retour ...");
        for (int i = 5; i < 50; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }

        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();

        monBandeau.sleep(1000);
        monBandeau.setMessage("EN TOURNÉE DANS TOUTE LA FRANCE");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }

    }

}
