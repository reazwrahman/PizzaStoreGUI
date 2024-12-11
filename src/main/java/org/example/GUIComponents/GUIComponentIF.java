package org.example.GUIComponents;

import javax.swing.*;

public interface GUIComponentIF {
    public void render();
    public JPanel getPanel();
    public void reset();
    public boolean validateInput();
    public String getOrder();
}
