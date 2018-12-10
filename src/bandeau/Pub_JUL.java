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
        
        
        monBandeau.setBackground(Color.BLACK);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.setMessage("Il est de retour ...");
        for (int i = 5; i < 50 ; i+=5) {
			monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			monBandeau.sleep(100);
		}
      
   }
}
