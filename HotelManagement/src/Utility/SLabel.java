/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Utility;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class SLabel extends JLabel{
    
    String text = new String();
    
    public SLabel(){
        
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sLabelMouseEntered(evt);
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sLabelMouseExited(evt);
            }
            
                                           

            private void sLabelMouseEntered(java.awt.event.MouseEvent evt) {                                    
              // TODO add your handling code here:
                text = getText();
                setForeground(Color.orange);
                setText("<html><u>"+text+"</u></html>");
                
            }                                   

            private void sLabelMouseExited(java.awt.event.MouseEvent evt) {                                   
               // TODO add your handling code here:
                setForeground(Color.black);
                setText(text);
            }              
        });
        
    }
    
    public static void main(String[] args) {
        new SLabel();
    }

}
