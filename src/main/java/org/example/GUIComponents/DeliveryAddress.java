package org.example.GUIComponents;

import javax.swing.*;
import java.awt.*;

public class DeliveryAddress extends AbstractGUIComponent implements GUIComponentIF{

    // text fields
    private JTextField nameText;
    private JTextField addressText;
    private JTextField addressDetailsText;
    private JTextField zipcode;

    @Override
    public void render(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Deliver To:"));

        addStaticLabels();
        addTextInputs();
    }

    private void addStaticLabels(){
        JPanel smallPanel = new JPanel();
        smallPanel.setLayout(new BoxLayout(smallPanel,BoxLayout.Y_AXIS));

        smallPanel.setBorder(BorderFactory.createEmptyBorder(3,3,3,3));
        smallPanel.add(new JLabel("Name:"));

        smallPanel.add(Box.createRigidArea(new Dimension(5,5)));
        smallPanel.add(new JLabel("Address:"));

        smallPanel.add(Box.createRigidArea(new Dimension(5,5)));
        smallPanel.add(new JLabel("City, State:"));

        smallPanel.add(Box.createRigidArea(new Dimension(5,5)));
        smallPanel.add(new JLabel("Zipcode:"));
        panel.add(smallPanel);
    }

    private void addTextInputs(){
        JPanel smallPanel = new JPanel();
        smallPanel = new JPanel();
        smallPanel.setLayout(new BoxLayout(smallPanel,BoxLayout.Y_AXIS));
        nameText = new JTextField();
        addressText = new JTextField();
        addressDetailsText = new JTextField();
        zipcode = new JTextField();

        smallPanel.add(nameText);
        smallPanel.add(addressText);
        smallPanel.add(addressDetailsText);
        smallPanel.add(zipcode);
        panel.add(smallPanel);
    }
}
