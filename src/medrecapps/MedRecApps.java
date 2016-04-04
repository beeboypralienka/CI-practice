/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrecapps;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import medrecapps.Gui.FrmUtama;

/**
 *
 * @author fachrulpbm
 */
public class MedRecApps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        try {            
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MedRecApps.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUtama fu = new FrmUtama();
                fu.setExtendedState(fu.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                fu.setVisible(true);
            }
        });
    }
}
