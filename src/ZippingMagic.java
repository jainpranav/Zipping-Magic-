import zippingmagic.*;
import javax.swing.SwingUtilities;


/**
 *
 * @author Pranav Jain
 */
public class ZippingMagic 
{
    
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() 
            {
                GUI ex = new GUI();
                ex.setVisible(true);
            }
        });
    }
}
