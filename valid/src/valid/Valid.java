/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valid;

/**
 *
 * @author chana
 */
public class Valid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new validation().setVisible(true);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone(); //To change body of generated methods, choose Tools | Templates.
            }
        
       });
                }           }
    
