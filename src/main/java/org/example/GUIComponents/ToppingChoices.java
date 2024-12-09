package org.example.GUIComponents;

import javax.swing.*;

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
}
