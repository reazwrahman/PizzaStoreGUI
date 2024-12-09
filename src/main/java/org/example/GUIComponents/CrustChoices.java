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
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Choose a Crust"));
        panel.setPreferredSize(new Dimension(250,0));

        crustButtonGroup = new ButtonGroup();
        regularCrustButton = new JRadioButton("Regular Crust",true);
        crustButtonGroup.add(regularCrustButton);
        panel.add(regularCrustButton);
        thinCrustButton = new JRadioButton("Thin Crust",false);
        crustButtonGroup.add(thinCrustButton);
        panel.add(thinCrustButton);
        handCrustButton = new JRadioButton("Hand-Tossed Crust",false);
        crustButtonGroup.add(handCrustButton);
        panel.add(handCrustButton);
        deepCrustButton = new JRadioButton("Deep-Dish Crust",false);
        crustButtonGroup.add(deepCrustButton);
        panel.add(deepCrustButton);
    }
}
