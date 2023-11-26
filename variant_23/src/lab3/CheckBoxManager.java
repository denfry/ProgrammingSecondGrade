package lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxManager extends JFrame {
    private final JCheckBox checkBox1;
    private final JCheckBox checkBox2;
    private final JCheckBox checkBox3;
    private final JCheckBox checkBox4;

    public CheckBoxManager() {

        setTitle("CheckBox Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);


        checkBox1 = new JCheckBox("CheckBox 1");
        checkBox2 = new JCheckBox("CheckBox 2");
        checkBox3 = new JCheckBox("CheckBox 3");
        checkBox4 = new JCheckBox("CheckBox 4");


        JMenuBar menuBar = new JMenuBar();
        JMenu actionMenu = getjMenu();


        menuBar.add(actionMenu);


        setJMenuBar(menuBar);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);


        add(panel);


        setVisible(true);
    }

    private JMenu getjMenu() {
        JMenu actionMenu = new JMenu("Actions");


        JMenuItem removeSelected = new JMenuItem("Remove Selected");
        JMenuItem removeAll = new JMenuItem("Remove All");
        JMenuItem printCount = new JMenuItem("Print Count");


        removeSelected.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeSelectedCheckBoxes();
            }
        });

        removeAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeAllCheckBoxes();
            }
        });

        printCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printCheckBoxCount();
            }
        });


        actionMenu.add(removeSelected);
        actionMenu.add(removeAll);
        actionMenu.add(printCount);
        return actionMenu;
    }

    private void removeSelectedCheckBoxes() {
        if (checkBox1.isSelected()) {
            checkBox1.setSelected(false);
        }
        if (checkBox2.isSelected()) {
            checkBox2.setSelected(false);
        }
        if (checkBox3.isSelected()) {
            checkBox3.setSelected(false);
        }
        if (checkBox4.isSelected()) {
            checkBox4.setSelected(false);
        }
    }

    private void removeAllCheckBoxes() {
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
    }

    private void printCheckBoxCount() {
        int count = 0;
        if (checkBox1.isSelected()) {
            count++;
        }
        if (checkBox2.isSelected()) {
            count++;
        }
        if (checkBox3.isSelected()) {
            count++;
        }
        if (checkBox4.isSelected()) {
            count++;
        }

        System.out.println("Number of selected checkboxes: " + count);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CheckBoxManager();
            }
        });
    }
}
