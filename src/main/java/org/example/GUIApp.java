package org.example;

import org.example.GUIComponents.*;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class GUIApp {

    private JFrame frame;
    private Container contentPane;

    // custom GUI components
    GUIMenu menuComponent;

    Map<String, GUIComponentIF> componentMapper = new HashMap<>();

    public GUIApp(){
        componentMapper.put(BorderLayout.NORTH, new ImagePanel());
        componentMapper.put(BorderLayout.EAST, new SideOrders());
        componentMapper.put(BorderLayout.WEST, new CrustChoices());
        componentMapper.put(BorderLayout.CENTER, new ToppingChoices());
    }

    public void start()
    {
        frame = new JFrame("GUI Menus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = frame.getContentPane();

        // set ui components
        renderMenu();
        renderRegions();

        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    private void renderMenu(){
        menuComponent = new GUIMenu(frame);
        menuComponent.render();
    }

    private void renderRegions(){
        for (String region: componentMapper.keySet()) {
            GUIComponentIF component = componentMapper.get(region);
            component.render();
            contentPane.add(component.getPanel(), region);
        }
    }
}
