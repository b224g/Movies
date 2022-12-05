package com.compagny;

import javax.swing.*;
import java.awt.*;

public class Registration extends JDialog{
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAddress;
    private JPasswordField tfPassword;
    private JPasswordField tfConfirmpassword;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPanel RegistrationPanel;

    public Registration(JFrame parent){
        super(parent);
        setTitle("Create a new account");
        setContentPane(RegistrationPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }
}
