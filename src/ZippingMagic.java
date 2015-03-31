import zippingmagic.*;
import javax.swing.SwingUtilities;


/**
 *
 * @author Pranav Jain
 * 
 * __________.__              .__                      _____                 .__        
\____    /|__|_____ ______ |__| ____    ____       /     \ _____     ____ |__| ____  
  /     / |  \____ \\____ \|  |/    \  / ___\     /  \ /  \\__  \   / ___\|  |/ ___\ 
 /     /_ |  |  |_> >  |_> >  |   |  \/ /_/  >   /    Y    \/ __ \_/ /_/  >  \  \___ 
/_______ \|__|   __/|   __/|__|___|  /\___  /    \____|__  (____  /\___  /|__|\___  >
        \/   |__|   |__|           \//_____/             \/     \//_____/         \/ 
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
