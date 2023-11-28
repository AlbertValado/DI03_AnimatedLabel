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

    private AnimatedLabel animatedLabel;
    private Timer timer;

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
        if (animatedLabel != null) {
            timer = new Timer(animatedLabel.getDelay(), new ActionListener() {
                int i = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (animatedLabel.isAnimate()) {
                        setText(animatedLabel.getText() + animatedLabel.getAppendedText().substring(0, i));
                        i = (i + 1) % (animatedLabel.getAppendedText().length() + 1);
                    } else {
                        setText(animatedLabel.getText());
                    }
                }
            });
            timer.start();
        }

    }

}
