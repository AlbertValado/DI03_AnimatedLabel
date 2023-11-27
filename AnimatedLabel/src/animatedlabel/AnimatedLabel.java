/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animatedlabel;

import java.io.Serializable;

/**
 *
 * @author Albert
 */
public class AnimatedLabel implements Serializable {

    private String text;
    private String appendedText;
    private int delay;
    private boolean animate;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAppendedText() {
        return appendedText;
    }

    public void setAppendedText(String appendedText) {
        this.appendedText = appendedText;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public boolean isAnimate() {
        return animate;
    }

    public void setAnimate(boolean animate) {
        this.animate = animate;
    }

    public AnimatedLabel(String text, String appendedText, int delay, boolean animate) {
        this.text = text;
        this.appendedText = appendedText;
        this.delay = delay;
        this.animate = animate;
    }
    
    
    
    
    
}
