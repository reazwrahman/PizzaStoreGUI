package org.example.guiComponents;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class GUIMenu
{
    private JFrame frame;

    // menu related
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;

    ArrayList<JMenuItem> menuItems = new ArrayList<>();

    public GUIMenu(JFrame guiFrame){
        frame = guiFrame;
    }


    public void render()
    {
        menuBar = new JMenuBar(); // first thing we need to add: the bar to hold "menu" objects
        frame.setJMenuBar(menuBar); // add the bar to the frame

        menu = new JMenu("File"); // this is the first "menu" type object
        menu.setMnemonic(KeyEvent.VK_F);

        JMenu name = new JMenu("Reaz");
        name.setMnemonic(KeyEvent.VK_R);

        menuBar.add(menu); // add the menu object to the bar
        menuBar.add(name);
        addMenuItems();
    }

    private void addMenuItems(){
        menuItem = new JMenuItem("New");
        menu.add(menuItem);
        menuItems.add(menuItem);
        menuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_N,
                        Event.CTRL_MASK));

        menuItem = new JMenuItem("Open");
        menu.add(menuItem);
        menuItems.add(menuItem);

        menuItem = new JMenuItem("Save");
        menu.add(menuItem);
        menuItems.add(menuItem);

        menuItem = new JMenuItem("Save As");
        menu.add(menuItem);
        menuItems.add(menuItem);
        menu.addSeparator();

        menuItem = new JMenuItem("Exit");
        menu.add(menuItem);
        menuItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_X,
                        Event.CTRL_MASK));
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        for (JMenuItem item: menuItems) {
            item.addActionListener(new newListener());
        }
    }

    private class newListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            newMethod(e.getActionCommand() + " was clicked, responding from newListener.");

        }

        private void newMethod(String message) {
            JOptionPane.showMessageDialog(frame,
                    message,
                    "Menu Item Click",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}