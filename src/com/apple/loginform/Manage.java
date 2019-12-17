package com.apple.loginform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manage {
    public static void main(String[] args){
        final RegisterForm registerForm = new RegisterForm();
        final LoginForm loginForm = new LoginForm();
        loginForm.setFrameLoginVisible(true);
        loginForm.getRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerForm.setFrameRegisterVisible(true);
                loginForm.setFrameLoginVisible(false);
            }
        });

        registerForm.getBackButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginForm.setFrameLoginVisible(true);
                registerForm.dispose();
            }
        });
    }
}
