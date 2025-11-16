/**
 *
 * @author fabi3
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater (new Runnable(){
            @Override
            public void run(){
                new ActionCentreMain().setVisible(true);
            }
        });
        
        // TODO code application logic here
    }
    
}
