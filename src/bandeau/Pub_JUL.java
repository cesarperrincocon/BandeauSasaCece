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
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
      
   }
}