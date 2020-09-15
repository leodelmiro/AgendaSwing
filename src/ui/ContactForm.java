package ui;

import business.ContactBusiness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonSave;
    private JButton buttonCancel;

    private ContactBusiness mContactBusiness;

    public ContactForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dimension.width / 2 - getSize().width / 2, dimension.height / 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mContactBusiness = new ContactBusiness();

        setListeners();
    }

    private void setListeners() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    String name = textName.getText();
                    String phone = textPhone.getText();

                    mContactBusiness.save(name, phone);

                    new MainForm();
                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(new JFrame(), e.getMessage());
                }
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new MainForm();
                dispose();
            }
        });
    }
}
