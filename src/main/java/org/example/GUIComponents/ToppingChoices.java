package org.example.GUIComponents;

import javax.swing.*;
import java.util.ArrayList;

public class ToppingChoices extends AbstractGUIComponent implements GUIComponentIF{

    // check boxes
    private JCheckBox beefBox;
    private JCheckBox chickenBox;
    private JCheckBox cheeseBox;
    private JCheckBox pepperBox;
    private JCheckBox onionBox;
    private JCheckBox mushroomBox;
    private JCheckBox oliveBox;
    private JCheckBox anchovyBox;

    @Override
    public void render(){
        m_panel = new JPanel();
        m_panel.setLayout(new BoxLayout(m_panel,BoxLayout.Y_AXIS));
        m_panel.setBorder(BorderFactory.createTitledBorder("Select Toppings"));

        beefBox = new JCheckBox("Beef", false);
        m_panel.add(beefBox);
        chickenBox = new JCheckBox("Chicken", false);
        m_panel.add(chickenBox);
        cheeseBox = new JCheckBox("Extra Cheese", false);
        m_panel.add(cheeseBox);
        pepperBox = new JCheckBox("Bell Peppers", false);
        m_panel.add(pepperBox);
        onionBox = new JCheckBox("Onions", false);
        m_panel.add(onionBox);
        mushroomBox = new JCheckBox("Mushrooms", false);
        m_panel.add(mushroomBox);
        oliveBox = new JCheckBox("Olives", false);
        m_panel.add(oliveBox);
        anchovyBox = new JCheckBox("Anchovies", false);
        m_panel.add(anchovyBox);

    }

    @Override
    public void reset(){
        for (java.awt.Component component: m_panel.getComponents()) {
            JCheckBox checkBox = (JCheckBox) component; // typecast to checkbox
            checkBox.setSelected(false);
        }
    }

    @Override
    public String getOrder(){
        String order = "Toppings: \n";
        if (chickenBox.isSelected())
            order += "     Chicken\n";
        if (beefBox.isSelected())
            order += "     Beef\n";
        if (cheeseBox.isSelected())
            order += "     Extra Cheese\n";
        if (pepperBox.isSelected())
            order += "     Peppers\n";
        if (onionBox.isSelected())
            order += "     Onions\n";
        if (mushroomBox.isSelected())
            order += "     Mushrooms\n";
        if (oliveBox.isSelected())
            order += "     Olives\n";
        if (anchovyBox.isSelected())
            order += "     Anchovies\n";
        return order;
    }
}
