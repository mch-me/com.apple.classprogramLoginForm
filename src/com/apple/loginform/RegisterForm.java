package com.apple.loginform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame{

    private JPanel panelRegister;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JLabel userEmail;
    private JTextField EmailText;
    private JButton backButton;
    private JButton registerButton;

    public JButton getBackButton() {
        return backButton;
    }

    public RegisterForm(){
        setTitle("Register Form");
        setSize(280, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelRegister = new JPanel();
        panelRegister.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panelRegister.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelRegister.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelRegister.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panelRegister.add(passwordText);

        userEmail = new JLabel("Email:");
        userEmail.setBounds(10,80,80,25);
        panelRegister.add(userEmail);

        EmailText = new JTextField(20);
        EmailText.setBounds(100,80,165,25);
        panelRegister.add(EmailText);

        backButton = new JButton("back");
        backButton.setBounds(100, 130, 80, 25);
        panelRegister.add(backButton);

        registerButton = new JButton("register");
        registerButton.setBounds(10, 130, 80, 25);
        panelRegister.add(registerButton);

        add(panelRegister);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void setFrameRegisterVisible(Boolean visible){
        setVisible(visible);
    }
}
