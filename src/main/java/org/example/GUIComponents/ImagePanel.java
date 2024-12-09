package org.example.GUIComponents;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends AbstractGUIComponent implements GUIComponentIF{

    private static final String IMAGE_REF = "veggie_delight.jpg";

    @Override
    public void render(){
        m_panel = new JPanel();
        ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(IMAGE_REF));
        JLabel imgLabel = new JLabel(imageIcon, JLabel.CENTER);
        m_panel.setPreferredSize(new Dimension(400,300));
        m_panel.add(imgLabel);
    }
}
