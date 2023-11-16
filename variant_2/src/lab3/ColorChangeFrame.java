package lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ColorChangeFrame extends javax.swing.JFrame {
    private JPanel colorPanel;
    private JComboBox<String> colorComboBox;

    public ColorChangeFrame() {
        super("Color Change");

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(300, 200));
        colorPanel.setBackground(Color.RED);

        String[] colorNames = {"RED", "GREEN", "BLUE", "YELLOW", "BLACK", "WHITE", "PINK", "ORANGE"};
        colorComboBox = new JComboBox<>(colorNames);
        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor();
            }
        });
        setLayout(new BorderLayout());

        add(colorPanel, BorderLayout.CENTER);
        add(colorComboBox, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void changeColor() {
        String selectedColor = (String) colorComboBox.getSelectedItem();
        switch (Objects.requireNonNull(selectedColor)) {
            case "RED":
                colorPanel.setBackground(Color.RED);
                break;
            case "GREEN":
                colorPanel.setBackground(Color.GREEN);
                break;
            case "BLUE":
                colorPanel.setBackground(Color.BLUE);
                break;
            case "YELLOW":
                colorPanel.setBackground(Color.YELLOW);
                break;
            case "BLACK":
                colorPanel.setBackground(Color.BLACK);
                break;
            case "WHITE":
                colorPanel.setBackground(Color.WHITE);
                break;
            case "PINK":
                colorPanel.setBackground(Color.PINK);
                break;
            case "ORANGE":
                colorPanel.setBackground(Color.ORANGE);
                break;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ColorChangeFrame();
            }
        });
    }
}