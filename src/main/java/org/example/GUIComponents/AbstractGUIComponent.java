package org.example.GUIComponents;

import javax.swing.*;

public abstract class AbstractGUIComponent implements GUIComponentIF {
    protected JPanel panel = null;

    @Override
    public JPanel getPanel() {
        if (panel == null) {
            render();
        }
        return panel;
    }
}
