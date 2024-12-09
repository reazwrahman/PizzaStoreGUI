package org.example.GUIComponents;

import javax.swing.*;
import java.awt.*;

public class SideOrders extends AbstractGUIComponent implements GUIComponentIF{
    private static final int COLUMNS = 4;
    private static final int WIDTH = 26;
    private static final int HEIGHT = 26;

    @Override
    public void render(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Sides (Enter Quantity)"));
        panel.setPreferredSize(new Dimension(150,0));

        makeSelection(" Bread Sticks");
        makeSelection(" Buffalo Wings");
    }

    private void makeSelection(String label){
        JPanel smallPanel = new JPanel();
        smallPanel.setLayout(new BoxLayout(smallPanel,BoxLayout.X_AXIS));
        JTextField textField = new JTextField("",COLUMNS);
        textField.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        smallPanel.add(textField);
        smallPanel.add(new JLabel(label));
        smallPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(smallPanel);
    }
}
