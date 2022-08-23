package com.km7dev.escribility.ui;

import com.km7dev.escribility.client.Escribility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscribilityWindow extends JFrame {

    JPanel settingsPanel;
    Container c;
    JButton file;
    JLabel fFrame;
    JPanel textPanel;
    JTextArea textArea;
    JPanel bgPanel;
    JButton quit;
    JButton save;
    JButton load;

    public void Initialize() {
        setTitle("Escribility");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(new Rectangle(25,25,1000,700));
        setIconImage(new ImageIcon("src/assets/icon.png").getImage());

        c = getContentPane();

        textPanel = new JPanel();
        textPanel.setLayout(null);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(800,650));
        textArea.setBounds(5,5,795,645);
        textArea.setBackground(null);
        textPanel.add(textArea);
        textPanel.setBackground(Color.LIGHT_GRAY);
        textPanel.setPreferredSize(new Dimension(800,650));
        textPanel.setBounds(200,50,800,650);

        c.add(textPanel);

        settingsPanel = new JPanel();
        settingsPanel.setLayout(null);

        file = new JButton();
        file.setBackground(Color.BLUE);
        file.setBounds(0,0,50,25);
        file.setIcon(new ImageIcon(new ImageIcon("src/assets/file.png").getImage().getScaledInstance(file.getWidth(), file.getHeight(), java.awt.Image.SCALE_SMOOTH)));
        file.setMargin(new Insets(0,0,0,0));
        file.setBorderPainted(false);
        file.setFocusPainted(false);
        file.setContentAreaFilled(false);
        file.setText("");

        fFrame = new JLabel();

        save = new JButton("Save");
        save.setBounds(0,0,125,25);
        fFrame.add(save);

        load = new JButton("Load");
        load.setBounds(0,25,125,25);
        fFrame.add(load);

        quit = new JButton("Quit");
        quit.setBounds(0,50,125,25);
        fFrame.add(quit);

        fFrame.setBounds(0,25,125,225);
        fFrame.setVisible(false);
        settingsPanel.add(fFrame);

        settingsPanel.add(file);
        settingsPanel.setBounds(0,0,800,225);

        c.add(settingsPanel);

        setVisible(true);

        file.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                fFrame.setVisible(!fFrame.isVisible());
            }

        });

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Escribility.dataManager.WriteToTxt(textArea.getText());
            }
        });

    }
}
