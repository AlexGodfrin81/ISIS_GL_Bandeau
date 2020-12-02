package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class Scenario {
    
    public static void main(String[] args) {
	    new Scenario().script();
    }
    
    public void script() {
        Bandeau monBandeau = new Bandeau();
        Effets ef = new Effets();
        String text1 = "coucou";
        String text2 = "Potit chat";
        
        //Init
        monBandeau.setMessage("On commence ?");
        monBandeau.sleep(1000);
        
        //Couleur
        monBandeau.setMessage("Changeons un peu ces couleurs");
        monBandeau.sleep(1000);
        monBandeau.setBackground(ef.randomColor());
        monBandeau.sleep(1000);
        Color c = ef.randomColor();
        while (c==monBandeau.getBackground()){
            c = ef.randomColor();
        }
        monBandeau.setForeground(c);
        monBandeau.sleep(1000);
        
        //Rotation
        monBandeau.setMessage("Tourne et retourne !");
        monBandeau.sleep(1000);
        for (int i = 0; i <= 100; i+=1) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(10);
	}
        monBandeau.sleep(100);
        for (int i = 100; i >= 0; i-=1) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(10);
	}
        
        //Pendu1
        monBandeau.setMessage("Un p'tit jeu du pendu ?");
        monBandeau.sleep(1000);
        String pendu1 = ef.jeuPendu(text1);
        monBandeau.setMessage(pendu1);
        monBandeau.sleep(1000);
        while (!pendu1.contentEquals(text1)){
            pendu1 = ef.jeuPenduResolution(pendu1,text1);
            monBandeau.setMessage(pendu1);
            monBandeau.sleep(300);
        }
        monBandeau.sleep(500);
        
        //Pendu2
        monBandeau.setMessage("Encore ? Aller, mais on accélère !");
        monBandeau.sleep(1000);
        String pendu2 = ef.jeuPendu(text2);
        monBandeau.setMessage(pendu2);
        monBandeau.sleep(500);
        while (!pendu2.contentEquals(text2)){
            pendu2 = ef.jeuPenduResolution(pendu2,text2);
            monBandeau.setMessage(pendu2);
            monBandeau.sleep(100);
        }
        
        //End
        monBandeau.sleep(1000);
        monBandeau.setMessage("On termine");
        monBandeau.sleep(1000);
        monBandeau.setMessage("");
        for (int i=0;i<25;i++){
            monBandeau.setBackground(ef.randomColor());
            monBandeau.sleep(40);
        }
        monBandeau.setForeground(Color.BLACK);
        monBandeau.setMessage("Désolé, trop tentant...");
        monBandeau.sleep(800);
        monBandeau.setMessage(":3");
        for (int i = 5; i < 99 ; i+=1) {
		monBandeau.setFont(new Font("SansSerif", Font.BOLD, 1+i));
		monBandeau.sleep(10);
	}
        monBandeau.sleep(1000);
        monBandeau.setFont(new Font("SansSerif", Font.BOLD, 30));
        monBandeau.setMessage("Merci, au revoir :)");
        monBandeau.sleep(1000);
        monBandeau.close();
    }
}
