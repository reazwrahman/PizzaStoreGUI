package org.example.GUIComponents;

import javax.swing.*;

public interface GUIComponentIF {
    public void render();
    public JPanel getPanel();
    public void reset();
    public String validateInput();
    public String getOrder();
}
