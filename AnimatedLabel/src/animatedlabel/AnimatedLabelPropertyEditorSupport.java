/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animatedlabel;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Albert
 */
public class AnimatedLabelPropertyEditorSupport extends PropertyEditorSupport {
    
    private AnimatedLabelPanel animatedLabelPanel = new AnimatedLabelPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Component getCustomEditor() {
        return animatedLabelPanel; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getJavaInitializationString() {
        AnimatedLabel animatedLabel = animatedLabelPanel.getSelectedValue();
        
        String text = animatedLabel.getText();
        String appendedText = animatedLabel.getAppendedText();
        int delay = animatedLabel.getDelay();
        boolean animate = animatedLabel.isAnimate();
        
        return "new animatedlabel.AnimatedLabel(\"" + text + "\",\"" + appendedText + "\"," + delay + "," + animate + ")"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValue() {
        return animatedLabelPanel.getSelectedValue(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
