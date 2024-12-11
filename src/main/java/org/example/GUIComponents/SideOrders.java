package org.example.GUIComponents;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class SideOrders extends AbstractGUIComponent implements GUIComponentIF{
    private static final int COLUMNS = 10;
    private static final int WIDTH = 70;
    private static final int HEIGHT = 26;

    private HashMap<String, JTextField> m_textFields = new HashMap<>();

    @Override
    public void render(){
        m_panel = new JPanel();
        m_panel.setLayout(new BoxLayout(m_panel,BoxLayout.Y_AXIS));
        m_panel.setBorder(BorderFactory.createTitledBorder("Sides (Enter Quantity)"));
        m_panel.setPreferredSize(new Dimension(250,0));

        makeSelection(" Bread Sticks");
        makeSelection(" Buffalo Wings");
    }

    private void makeSelection(String label){
        JPanel smallPanel = new JPanel();
        smallPanel.setLayout(new BoxLayout(smallPanel,BoxLayout.X_AXIS));
        JTextField textField = new JTextField("0",COLUMNS);
        m_textFields.put(label, textField);
        textField.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        smallPanel.add(textField);
        smallPanel.add(new JLabel(label));
        smallPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        m_panel.add(smallPanel);
    }

    @Override
    public void reset(){
        for (String label: m_textFields.keySet()){
            m_textFields.get(label).setText("0");
        }
    }

    @Override
    public String validateInput(){
        String errorMessage = "";
        try {
            for (String label: m_textFields.keySet()) {
                Integer qty = Integer.parseInt(m_textFields.get(label).getText()); }
        } catch (NumberFormatException nfe) {
            errorMessage = "Side order entries must be numeric,\n" +
                    "and must be whole numbers";
        }
        return errorMessage;
    }

    @Override
    public String getOrder(){
        String order = "Sides: \n";
        var qtyMapper = getQty();

        for (String side: qtyMapper.keySet()) {
            order += "     " + qtyMapper.get(side) + side + "\n";
        }
        return order;
    }

    private HashMap<String, Integer> getQty(){
        HashMap<String, Integer> qtyMapper =  new HashMap<>();
        for (String label: m_textFields.keySet()) {
            Integer qty = Integer.parseInt(m_textFields.get(label).getText());

            if (qty >0) {
                qtyMapper.put(label, qty);
            }
        }
        return qtyMapper;
    }
}
