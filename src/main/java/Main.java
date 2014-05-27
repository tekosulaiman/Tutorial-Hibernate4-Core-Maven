
import co.id.desktopui.MenuUtama;
import javax.swing.UIManager;

/**
 * @author tombisnis@yahoo.com
 */
public class Main {
    public static void main (String[]args){
        try{
            UIManager.setLookAndFeel(new com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel());
        }catch (Exception e){
       
        }
        
        new MenuUtama().setVisible(true);
    }
}