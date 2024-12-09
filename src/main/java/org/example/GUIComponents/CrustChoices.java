package org.example.GUIComponents;

import javax.swing.*;
import java.awt.*;

public class CrustChoices extends AbstractGUIComponent implements GUIComponentIF{

    // radio buttons and button group
    private JRadioButton regularCrustButton;
    private JRadioButton thinCrustButton;
    private JRadioButton handCrustButton;
    private JRadioButton deepCrustButton;
    private ButtonGroup crustButtonGroup;

    @Override
    public void render(){
        m_panel = new JPanel();
        m_panel.setLayout(new BoxLayout(m_panel,BoxLayout.Y_AXIS));
        m_panel.setBorder(BorderFactory.createTitledBorder("Choose a Crust"));
        m_panel.setPreferredSize(new Dimension(250,0));

        crustButtonGroup = new ButtonGroup();
        regularCrustButton = new JRadioButton("Regular Crust",true);
        crustButtonGroup.add(regularCrustButton);
        m_panel.add(regularCrustButton);
        thinCrustButton = new JRadioButton("Thin Crust",false);
        crustButtonGroup.add(thinCrustButton);
        m_panel.add(thinCrustButton);
        handCrustButton = new JRadioButton("Hand-Tossed Crust",false);
        crustButtonGroup.add(handCrustButton);
        m_panel.add(handCrustButton);
        deepCrustButton = new JRadioButton("Deep-Dish Crust",false);
        crustButtonGroup.add(deepCrustButton);
        m_panel.add(deepCrustButton);
    }
}
