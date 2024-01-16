/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animatedlabel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Albert
 */
public class LabelAnimatedLabel extends JLabel implements Serializable {

    private String originalText;
    private String appendedText;
    private int delay;
    private boolean animate;
    private Timer timer;

    public LabelAnimatedLabel(String text, String appendedText, int delay, boolean animate) {
        this.originalText = text;
        this.appendedText = appendedText;
        this.delay = delay;
        this.animate = animate;
    }

    public LabelAnimatedLabel() {
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String text) {
        this.originalText = text;
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
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
            timer = new Timer(delay, new ActionListener() {
                int i = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (animate) {
                        setText(originalText + appendedText.substring(0, i));
                        i = (i + 1) % (appendedText.length() + 1);
                    } else {
                        setText(originalText);
                    }
                }
            });
            timer.start();
        
    }

}
