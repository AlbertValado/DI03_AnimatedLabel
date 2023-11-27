/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animatedlabel;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JLabel;

/**
 *
 * @author Albert
 */
public class LabelAnimatedLabel extends JLabel implements Serializable {
    
    private AnimatedLabel animatedLabel;

    public LabelAnimatedLabel() {
    }

    public AnimatedLabel getAnimatedLabel() {
        return animatedLabel;
    }

    public void setAnimatedLabel(AnimatedLabel animatedLabel) {
        this.animatedLabel = animatedLabel;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
    }
    
    
    
}
