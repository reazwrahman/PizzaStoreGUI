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
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createTitledBorder("Select Toppings"));

        beefBox = new JCheckBox("Beef", false);
        panel.add(beefBox);
        chickenBox = new JCheckBox("Chicken", false);
        panel.add(chickenBox);
        cheeseBox = new JCheckBox("Extra Cheese", false);
        panel.add(cheeseBox);
        pepperBox = new JCheckBox("Bell Peppers", false);
        panel.add(pepperBox);
        onionBox = new JCheckBox("Onions", false);
        panel.add(onionBox);
        mushroomBox = new JCheckBox("Mushrooms", false);
        panel.add(mushroomBox);
        oliveBox = new JCheckBox("Olives", false);
        panel.add(oliveBox);
        anchovyBox = new JCheckBox("Anchovies", false);
        panel.add(anchovyBox);
    }
}
