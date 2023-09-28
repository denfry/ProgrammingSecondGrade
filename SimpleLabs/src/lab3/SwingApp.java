package lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SwingApp {

    private static final int[] buttonClickCounts = new int[4];
    private static int totalClicks = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Графическое приложение");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            JMenuBar menuBar = getjMenuBar();

            JPanel panel = getjPanel();

            frame.setJMenuBar(menuBar);
            frame.getContentPane().add(panel);
            frame.setVisible(true);
        });
    }

    private static JPanel getjPanel() {
        JPanel panel = new JPanel(new FlowLayout());

        for (int i = 0; i < 4; i++) {
            final int buttonIndex = i;
            JButton button = new JButton("Кнопка " + (i + 1));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonClickCounts[buttonIndex]++;
                    totalClicks++;
                }
            });
            panel.add(button);
        }
        return panel;
    }

    private static JMenuBar getjMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Меню");
        menu.setMnemonic(KeyEvent.VK_M);

        JMenuItem menuItem1 = new JMenuItem("Показать статистику");
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showStatistics();
            }
        });

        JMenuItem menuItem2 = new JMenuItem("Сбросить счетчик");
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetCounter();
            }
        });

        menu.add(menuItem1);
        menu.add(menuItem2);
        menuBar.add(menu);
        return menuBar;
    }

    private static void showStatistics() {
        for (int i = 0; i < 4; i++) {
            double percentage = (double) buttonClickCounts[i] / totalClicks * 100;
            System.out.println("Кнопка " + (i + 1) + ": " + buttonClickCounts[i] + " раз(а) (" + percentage + "%)");
        }
    }

    private static void resetCounter() {
        for (int i = 0; i < 4; i++) {
            buttonClickCounts[i] = 0;
        }
        totalClicks = 0;
        System.out.println("Счетчик сброшен.");
    }
}

