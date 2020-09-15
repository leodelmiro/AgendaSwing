package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton buttonRemoveContact;
    private JTable tableContacts;

    public MainForm(){
        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dimension.width/2 - getSize().width / 2, dimension.height/2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setListeners();
    }

    private void setListeners() {
        buttonNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ContactForm();
                dispose();
            }
        });

        buttonRemoveContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
}
